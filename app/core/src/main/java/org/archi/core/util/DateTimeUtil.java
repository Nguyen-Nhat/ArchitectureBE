package org.archi.core.util;

import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public final class DateTimeUtil {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static Timestamp toProtoTimestamp(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return Timestamp.getDefaultInstance();
        }

        return Timestamps.fromMillis(localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli());
    }

    public static LocalDateTime fromProtoTimestamp(Timestamp timestamp) {
        if (timestamp == null || timestamp.equals(Timestamp.getDefaultInstance())) {
            return null;
        }

        Instant instant = Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos());
        return LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
    }


    public static String toString(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return localDateTime.format(formatter);
        }
        else {
            return "";
        }
    }

    public static LocalDateTime fromString(String timeStr) {
        if (timeStr == null || timeStr.isEmpty()) {
            return null;
        }

        return LocalDateTime.parse(timeStr, formatter);
    }
}
