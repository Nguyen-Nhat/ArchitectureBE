package org.archi.auth.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.archi.auth.model.Account;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class EmailService {
  private final JwtService jwtService;
  private final JavaMailSender javaMailSender;
  private final Environment environment;

  public String generateBodyText(Account account) {
    String host = environment.getProperty("HOST", "http://localhost:8080");
    String token = jwtService.generateToken(account, 30 * 60 * 1000); // maximum 30 mins.
    return "To verify your account, please click the link: " +
            host + "/api/auth/verify-email?token=" + token;
  }


  @Async
  public void sendEmail(String to, String subject, String body) {
    MimeMessage mimeMessage = javaMailSender.createMimeMessage();
    String sender = environment.getProperty("spring.mail.username", "maivanminh.se@gmail.com");
    try {
      MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
      mimeMessageHelper.setSubject(subject);
      mimeMessageHelper.setFrom(new InternetAddress(sender));
      mimeMessageHelper.setTo(to);
      mimeMessageHelper.setText(body);
      javaMailSender.send(mimeMessageHelper.getMimeMessage());
    } catch (MessagingException e) {
      log.error(String.valueOf(e.getCause()));
      e.printStackTrace();
    }
  }
}
