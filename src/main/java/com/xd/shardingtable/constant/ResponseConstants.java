package com.xd.shardingtable.constant;

/**
 * @author wind_
 * @date 2019/7/6
 */
public interface ResponseConstants {

    String ADMIN_TAIL_MSG = "请联系管理员！";

    /**
     * @desc 成功返回值
     * @author wind_
     * @date 2019/7/28
     */
    int SUCCESS_CODE = 0;
    String OK_MSG = "ok";

    /**
     * @desc 失败返回值，msg自定义
     * @author wind_
     * @date 2019/7/28
     */
    int FAIL_CODE = -1;
    String FAIL_MSG = "no";

    /**
     * @desc 列表查询
     * @author wind_
     * @date 2019/7/28
     */
    String SEARCH_LIST_NOT_FOUND_MSG = "暂无数据！";

    /**
     * @desc 【登录模块】相关返回
     * @author wind_
     * @date 2019/7/28
     */
    int LOGIN_INVALID_CODE = -2;
    String LOGIN_INVALID_MSG = "未登录或登录过期，请重新登录！";
    int PERMISSIONS_INVALID_CODE = -3;
    String PERMISSIONS_INVALID_MSG = "无权限访问，如果已经授权，请重新登录！";
    String LOGIN_AUTHENTICATION_FAIL_MSG = "账号或密码错误！";
    String USER_DISABLE_MSG = "用户已被禁用，" + ADMIN_TAIL_MSG;
    String USER_ACCOUNT_DISABLE_MSG = "账号已被禁用，" + ADMIN_TAIL_MSG;
    String LOGIN_FAIL_MSG = "登录失败，如多次出现，" + ADMIN_TAIL_MSG;
    String USER_ACCOUNT_EXISTS = "账号已存在！";
    String ADD_USER_FAIL_MSG = "添加用户失败，如多次出现，" + ADMIN_TAIL_MSG;
    String DELETE_USER_FAIL_MSG = "删除用户失败，如多次出现，" + ADMIN_TAIL_MSG;
    String DELETE_USER_ROW_ZERO_MSG = "删除用户失败，用户可能已被删除！";
    String EDIT_USER_FAIL_MSG = "编辑用户失败，如多次出现，" + ADMIN_TAIL_MSG;
    String EDIT_USER_ROW_ZERO_MSG = "编辑用户失败，用户可能已被删除！";
    String DISABLE_USER_FAIL_MSG = "禁用失败，如多次出现，" + ADMIN_TAIL_MSG;
    String DISABLE_USER_ROW_ZERO_MSG = "禁用失败，用户可能已被删除！";
    String DISABLE_PERMISSION_FAIL_MSG = "禁用失败，如多次出现，" + ADMIN_TAIL_MSG;
    String DISABLE_PERMISSION_ROW_ZERO_MSG = "禁用失败，用户可能已被删除！";

    /**
     * @desc 校验相关返回
     * @author wind_
     * @date 2019/7/28
     */
    int PARAMS_INVALID_CODE = -999;
    String PARAMS_INVALID_MSG = "请求参数有误！";
    int REQUEST_METHOD_NOT_SUPPORT_CODE = -1000;
    String REQUEST_METHOD_NOT_SUPPORT_MSG = "请求方式有误！";
    int REQUEST_MEDIA_NOT_SUPPORT_CODE = -1001;
    String REQUEST_MEDIA_NOT_SUPPORT_MSG = "请求体有误！";

    /**
     * @desc 异常相关返回
     * @author wind_
     * @date 2019/7/28
     */
    int SERVER_EXCEPTION_CODE = -1099;
    String SERVER_EXCEPTION_MSG = "操作出现了意外，如果多次出现，" + ADMIN_TAIL_MSG;
    int SERVER_ERROR_CODE = -9999;
    String SERVER_ERROR_MSG = "服务器暂时开小差了，如果多次出现，" + ADMIN_TAIL_MSG;
}
