package com.xd.shardingtable.handler;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.google.common.collect.ImmutableMap;
import com.xd.shardingtable.bean.base.BaseResultBean;
import com.xd.shardingtable.exception.ServiceException;
import com.xd.shardingtable.utils.ResponseUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.support.WebExchangeBindException;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wind_
 * @desc 全局异常处理
 * @date 2019/7/10
 */
@RestControllerAdvice
public class BaseExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(BaseExceptionHandler.class);

    /**
     * @desc 全局参数校验
     * @author wind_
     * @date 2019/7/10
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResultBean validBodyHandler(MethodArgumentNotValidException e) {
        String errorMsg = e.getBindingResult().getAllErrors().get(0).getDefaultMessage();
        logger.error("params no valid :{} ----- {}", e, errorMsg);
        return ResponseUtils.paramsException(errorMsg);
    }

    /**
     * @desc 请求方法不匹配
     * @author wind_
     * @date 2019/7/25
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public BaseResultBean requestMethodExceptionHandler(HttpRequestMethodNotSupportedException e) {
        logger.error("request method exception : ex - ", e);
        return ResponseUtils.requestMethodException();
    }

    /**
     * @desc 请求体不匹配
     * @author wind_
     * @date 2019/7/25
     */
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public BaseResultBean httpMediaTypeNotSupportedExceptionHandler(HttpMediaTypeNotSupportedException e) {
        logger.error("request method exception : ex - ", e);
        return ResponseUtils.requestMediaTypeException();
    }

    /**
     * @desc 请求体为空
     * @author wind_
     * @date 2019/7/25
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public BaseResultBean httpMessageNotReadableExceptionExceptionHandler(HttpMessageNotReadableException e) {
        logger.error("request method exception : ex - ", e);
        return ResponseUtils.requestMediaTypeException();
    }

    /**
     * @desc 自定义业务异常
     * @author wind_
     * @date 2019/7/10
     */
    @ExceptionHandler(ServiceException.class)
    public BaseResultBean serviceExceptionHandler(ServiceException e) {
        Integer errorCode = e.getErrorCode();
        String errorMsg = e.getErrorMsg();
        if (e.getException() != null) {
            logger.error("service error : code - {}, msg - {}, ex - {}", errorCode, errorMsg, e.getException());
        } else {
            logger.error("service error : code - {}, msg - {}, ex - {}", errorCode, errorMsg, e);
        }
        return ResponseUtils.serviceException(errorCode, errorMsg);
    }

    /**
     * @desc 未知异常
     * @author wind_
     * @date 2019/7/10
     */
    @ExceptionHandler(Exception.class)
    public BaseResultBean exceptionHandler(Exception e) {
        logger.error("server error : ex - ", e);
        return ResponseUtils.exception();
    }
}
