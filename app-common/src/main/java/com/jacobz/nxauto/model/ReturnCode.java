package com.jacobz.nxauto.model;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum ReturnCode {

    UNKNOWN_ERROR("999", "Operation Failed, unknown error"),

    SUCCESS("200", "Success"),
    SERVICE_DOWNGRADED("201", "Service Downgraded"),
    FLOW_LIMITED("202", "flow limited, please try again later"),

    UNAUTHORIZED("401", "Unauthorized"),
    ACCESS_DENIED("403", "Access denied"),
    NOT_FOUND("404", "Not found"),

    INTERNAL_ERROR("500", "Internal error");

    private final String code;
    private final String message;

    ReturnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
    public static ReturnCode getReturnCode(String code) {
        return Arrays.stream(ReturnCode.values()).filter(x -> x.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
    }
}
