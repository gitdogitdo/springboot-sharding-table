package com.xd.shardingtable.constant;

/**
 * @author wind_
 * @desc 参数校验错误msg
 * @date 2019/7/10
 */
public interface ParamsValidMsgConstants {
    String PARAM_ERROR = "参数有误！";

    String USER_ID_NULL = "用户不能为空！";
    String USER_ID_ERROR = "用户有误！";

    String USER_LOGIN_ID_NULL = "账户不能为空！";
    String USER_LOGIN_ID_ERROR = "账户有误！";

    String USER_LOGIN_NAME_BLANK = "账号不能为空！";
    String USER_LOGIN_NAME_ERROR = "账号限定长度为6-12！";

    String USER_LOGIN_PASSWORD_BLANK = "密码不能为空！";
    String USER_LOGIN_PASSWORD_LENGTH_ERROR = "密码仅能为英文数字组合，且长度限定为6-12！";
    String USER_LOGIN_PASSWORD_ERROR = "密码仅能为英文数字组合，且长度限定为6-12！";

    String VERIFICATION_CODE_BLANK = "验证码不能为空！";

    String USER_NAME_BLANK = "用户名不能为空！";
    String USER_NAME_ERROR = "用户名限定长度为2-5！";

    String USER_PHONE_BLANK = "用户手机号不能为空！";
    String USER_PHONE_ERROR = "用户手机号有误！";

    String USER_STATUS_NULL = "用户状态不能为空！";
    String USER_STATUS_ERROR = "用户状态有误！";

    String USER_LOGIN_STATUS_NULL = "账户状态不能为空！";
    String USER_LOGIN_STATUS_ERROR = "账户状态有误！";

    String PAGE_NO_BLANK = "页码不能为空！";
    String PAGE_NO_ERROR = "页码有误！";

    String PAGE_SIZE_BLANK = "条数不能为空！";
    String PAGE_SIZE_ERROR = "条数有误！";
}
