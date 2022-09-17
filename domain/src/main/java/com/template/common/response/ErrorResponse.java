package com.template.common.response;

import com.template.common.exception.ErrorCode;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ErrorResponse {

    private int code;
    private String message;

    @Builder
    public ErrorResponse(ErrorCode errorStatus) {
        this.code = errorStatus.getCode();
        this.message = errorStatus.getMessage();
    }
}
