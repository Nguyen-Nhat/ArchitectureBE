package org.archi.fps.service;

import lombok.RequiredArgsConstructor;
import org.apache.tika.Tika;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.nio.ByteBuffer;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FileService {
    @Autowired
    private S3Client s3Client;
    @Value("${aws.bucket.name}")
    private String bucketName;
    @Value("${aws.cloud_front.distribution_domain}")
    private String distributionDomain;
    private final Tika tika = new Tika();

    public String uploadImage(MultipartFile file) {
        try {
            if (file.isEmpty()) {
                return null;
            }

            String objectKey = generateRandomName(file.getOriginalFilename());
            PutObjectRequest request = PutObjectRequest.builder()
                    .bucket(bucketName)
                    .key(objectKey)
                    .contentType(tika.detect(file.getOriginalFilename()))
                    .contentLength(file.getSize())
                    .build();

            ByteBuffer byteBuffer = ByteBuffer.wrap(file.getBytes());
            s3Client.putObject(request, RequestBody.fromByteBuffer(byteBuffer));

            return generateFileUrl(objectKey);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private String generateFileUrl(String objectKey) {
        if (distributionDomain != null && !distributionDomain.isEmpty()) {
            return String.format("https://%s/%s", distributionDomain, objectKey);
        } else {
            return String.format("https://%s.s3.amazonaws.com/%s", bucketName, objectKey);
        }
    }

    private String generateRandomName(String fileName) {
        String extension = "";
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex >= 0) {
            extension = fileName.substring(dotIndex + 1);
        }
        return UUID.randomUUID().toString().replace("-", "") + (extension.isEmpty() ? "" : "." + extension);
    }
}
