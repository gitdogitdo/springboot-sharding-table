package com.xd.shardingtable.constant;

/**
 * @author wind_
 * @date 2019/6/30
 */
public interface ServiceCodeConstants {

    /**
     * SV_USER_LOGIN_STATUS_OK - sv账户状态 0-正常,-1禁用,-2暂禁
     */
    Integer SV_USER_LOGIN_STATUS_OK = 0;

    /**
     * SV_USER_STATUS_OK - sv用户状态 0-正常,-1禁用,-2暂禁
     */
    Integer SV_USER_STATUS_OK = 0;

    /**
     * SYS_ROLE_STATUS_OK - 角色状态 0-正常,1-禁用
     */
    Integer SYS_ROLE_STATUS_OK = 0;

    /**
     * SYS_MENU_STATUS_OK - 菜单状态 0-正常,1-禁用
     */
    Integer SYS_MENU_STATUS_OK = 0;

    /**
     * SYS_PERMISSION_STATUS_OK - 权限状态 0-正常,1-禁用
     */
    Integer SYS_PERMISSION_STATUS_OK = 0;
    Integer SYS_PERMISSION_STATUS_DISABLE = 1;
}
