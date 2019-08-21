package com.xd.shardingtable.exception;

import com.xd.shardingtable.enums.ResponseEnum;

/**
 * @author wind_
 * @desc 业务异常
 * @date 2019/7/10
 */
public class ServiceException extends RuntimeException {
    private Integer errorCode;
    private String errorMsg;
    private Exception exception;

    public ServiceException() {
        this.errorCode = ResponseEnum.SERVER_EXCEPTION.getCode();
        this.errorMsg = ResponseEnum.SERVER_EXCEPTION.getMsg();
    }

    /**
     * @desc 自定义异常
     * @author wind_
     * @date 2019/7/10
     */
    public ServiceException(String errorMsg) {
        this.errorCode = ResponseEnum.SERVER_EXCEPTION.getCode();
        this.errorMsg = errorMsg;
    }

    /**
     * @desc 保留原始异常
     * @author wind_
     * @date 2019/7/10
     */
    public ServiceException(String errorMsg, Exception exception) {
        this.errorCode = ResponseEnum.SERVER_EXCEPTION.getCode();
        this.errorMsg = errorMsg;
        this.exception = exception;
    }

    public ServiceException(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public ServiceException(Integer errorCode, String errorMsg, Exception exception) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.exception = exception;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }
}
