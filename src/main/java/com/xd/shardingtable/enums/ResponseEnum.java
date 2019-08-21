package com.xd.shardingtable.enums;

import com.xd.shardingtable.constant.ResponseConstants;

/**
 * @author wind_
 * @desc 返回值枚举
 * @date 2019/7/28
 */
public enum ResponseEnum {
    SUCCESS(ResponseConstants.SUCCESS_CODE, ResponseConstants.OK_MSG),
    SEARCH_LIST_NOT_FOUND(ResponseConstants.SUCCESS_CODE, ResponseConstants.SEARCH_LIST_NOT_FOUND_MSG),
    FAIL(ResponseConstants.FAIL_CODE, ResponseConstants.FAIL_MSG),
    LOGIN_AUTHENTICATION_FAIL(ResponseConstants.FAIL_CODE, ResponseConstants.LOGIN_AUTHENTICATION_FAIL_MSG),
    USER_DISABLE(ResponseConstants.FAIL_CODE, ResponseConstants.USER_DISABLE_MSG),
    USER_ACCOUNT_DISABLE(ResponseConstants.FAIL_CODE, ResponseConstants.USER_ACCOUNT_DISABLE_MSG),
    LOGIN_FAIL(ResponseConstants.FAIL_CODE, ResponseConstants.LOGIN_FAIL_MSG),
    LOGIN_INVALID(ResponseConstants.LOGIN_INVALID_CODE, ResponseConstants.LOGIN_INVALID_MSG),
    PERMISSIONS_INVALID(ResponseConstants.PERMISSIONS_INVALID_CODE, ResponseConstants.PERMISSIONS_INVALID_MSG),
    USER_ACCOUNT_EXISTS(ResponseConstants.FAIL_CODE, ResponseConstants.USER_ACCOUNT_EXISTS),
    ADD_USER_FAIL(ResponseConstants.FAIL_CODE, ResponseConstants.ADD_USER_FAIL_MSG),
    ADD_USER_ROW_ZERO(ResponseConstants.FAIL_CODE, ResponseConstants.ADD_USER_FAIL_MSG),
    DELETE_USER_FAIL(ResponseConstants.FAIL_CODE, ResponseConstants.DELETE_USER_FAIL_MSG),
    DELETE_USER_ROW_ZERO(ResponseConstants.FAIL_CODE, ResponseConstants.DELETE_USER_ROW_ZERO_MSG),
    EDIT_USER_FAIL(ResponseConstants.FAIL_CODE, ResponseConstants.EDIT_USER_FAIL_MSG),
    EDIT_USER_ROW_ZERO(ResponseConstants.FAIL_CODE, ResponseConstants.EDIT_USER_ROW_ZERO_MSG),
    DISABLE_USER_FAIL(ResponseConstants.FAIL_CODE, ResponseConstants.DISABLE_USER_FAIL_MSG),
    DISABLE_USER_ROW_ZERO(ResponseConstants.FAIL_CODE, ResponseConstants.DISABLE_USER_ROW_ZERO_MSG),
    DISABLE_PERMISSION_FAIL(ResponseConstants.FAIL_CODE, ResponseConstants.DISABLE_PERMISSION_FAIL_MSG),
    DISABLE_PERMISSION_ZERO(ResponseConstants.FAIL_CODE, ResponseConstants.DISABLE_PERMISSION_ROW_ZERO_MSG),
    PARAMS_INVALID(ResponseConstants.PARAMS_INVALID_CODE, ResponseConstants.PARAMS_INVALID_MSG),
    REQUEST_METHOD_ERROR(ResponseConstants.REQUEST_METHOD_NOT_SUPPORT_CODE, ResponseConstants.REQUEST_METHOD_NOT_SUPPORT_MSG),
    REQUEST_MEDIA_ERROR(ResponseConstants.REQUEST_MEDIA_NOT_SUPPORT_CODE, ResponseConstants.REQUEST_MEDIA_NOT_SUPPORT_MSG),
    SERVER_EXCEPTION(ResponseConstants.SERVER_EXCEPTION_CODE, ResponseConstants.SERVER_EXCEPTION_MSG),
    SERVER_ERROR(ResponseConstants.SERVER_ERROR_CODE, ResponseConstants.SERVER_ERROR_MSG);

    ResponseEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
