package com.template.persistence.user.exception;

import com.template.common.exception.ErrorCode;
import lombok.Getter;

@Getter
public class NameDuplicateException extends RuntimeException {
  private final ErrorCode errorCode;

  public NameDuplicateException() { this.errorCode = ErrorCode.NAME_DUPLICATE; }

}
