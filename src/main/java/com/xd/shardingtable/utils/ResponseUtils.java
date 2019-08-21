package com.xd.shardingtable.utils;

import com.alibaba.fastjson.JSONObject;
import com.xd.shardingtable.bean.base.BaseResultBean;
import com.xd.shardingtable.enums.ResponseEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wind_
 * @desc 接口返回utils
 * @date 2019/7/24
 */
public class ResponseUtils {
    // 用于查询list为空，data返回为[]使用。
    private static final List emptyArray = new ArrayList(0);
    private static final JSONObject emptyObj = new JSONObject();

    public static <T> BaseResultBean success() {
        return new BaseResultBean(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), null);
    }

    public static <T> BaseResultBean success(T data) {
        return new BaseResultBean(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), data);
    }

    public static <T> BaseResultBean success(String msg, T data) {
        return new BaseResultBean(ResponseEnum.SUCCESS.getCode(), msg, data);
    }

    public static <T> BaseResultBean fail(String msg, T data) {
        return new BaseResultBean(ResponseEnum.FAIL.getCode(), msg, data);
    }

    public static <T> BaseResultBean getObjSuccess(T data) {
        return success(ResponseEnum.SUCCESS.getMsg(), data);
    }

    public static <T> BaseResultBean getObjNotFound() {
        return success(ResponseEnum.SUCCESS.getMsg(), emptyObj);
    }

    public static <T> BaseResultBean rowsSuccess(T data, long total) {
        Map<String, Object> resultMap = new HashMap<>(2);
        resultMap.put("rows", data);
        resultMap.put("total", total);
        return success(ResponseEnum.SUCCESS.getMsg(), resultMap);
    }

    public static BaseResultBean rowsNotFound() {
        Map<String, Object> resultMap = new HashMap<>(2);
        resultMap.put("rows", emptyArray);
        resultMap.put("total", 0);
        return success(ResponseEnum.SEARCH_LIST_NOT_FOUND.getMsg(), resultMap);
    }

    public static BaseResultBean loginInvalid() {
        return new BaseResultBean(ResponseEnum.LOGIN_INVALID.getCode(), ResponseEnum.LOGIN_INVALID.getMsg(), false);
    }

    public static BaseResultBean paramsException(String errorMsg) {
        return new BaseResultBean(ResponseEnum.PARAMS_INVALID.getCode(), errorMsg, false);
    }

    public static BaseResultBean requestMethodException() {
        return new BaseResultBean(ResponseEnum.REQUEST_METHOD_ERROR.getCode(), ResponseEnum.REQUEST_METHOD_ERROR.getMsg(), false);
    }

    public static BaseResultBean requestMediaTypeException() {
        return new BaseResultBean(ResponseEnum.REQUEST_MEDIA_ERROR.getCode(), ResponseEnum.REQUEST_MEDIA_ERROR.getMsg(), false);
    }

    public static BaseResultBean serviceException(Integer errorCode, String errorMsg) {
        return new BaseResultBean(errorCode, errorMsg, false);
    }

    public static BaseResultBean exception() {
        return new BaseResultBean(ResponseEnum.SERVER_ERROR.getCode(), ResponseEnum.SERVER_ERROR.getMsg(), false);
    }
}
