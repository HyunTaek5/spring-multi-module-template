package com.template.persistence.user.exception;

import com.template.common.exception.ErrorCode;
import lombok.Getter;

@Getter
public class CustomInterAuthenticationServiceException extends RuntimeException {

  private final ErrorCode errorCode;

  public CustomInterAuthenticationServiceException() { this.errorCode = ErrorCode.INTERNAL_AUTHENTICATE_FAILED; }


}
