package com.template.persistence.user.exception;

import com.template.common.exception.ErrorCode;
import lombok.Getter;

@Getter
public class UsernameDuplicateException extends RuntimeException {
  private final ErrorCode errorCode;

  public UsernameDuplicateException() { this.errorCode = ErrorCode.USERNAME_DUPLICATE; }

}
