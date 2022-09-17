package com.template.persistence.user.exception;

import com.template.common.exception.ErrorCode;
import lombok.Getter;

// 예시 커스텀 exception 입니다.
@Getter
public class UserNotFoundException extends RuntimeException {

    private final ErrorCode errorCode;

    public UserNotFoundException() { this.errorCode = ErrorCode.USER_NOT_FOUND; }


}
