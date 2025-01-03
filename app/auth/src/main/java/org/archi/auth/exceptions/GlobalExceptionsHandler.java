package org.archi.auth.exceptions;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;
import org.springframework.core.annotation.Order;

@Order(1)
@GrpcAdvice
public class GlobalExceptionsHandler {
  @GrpcExceptionHandler({RuntimeException.class})
  public StatusRuntimeException handleRuntimeException(RuntimeException exception) {
    return Status.INTERNAL.withDescription(exception.getMessage()).withCause(exception).asRuntimeException();
  }
}