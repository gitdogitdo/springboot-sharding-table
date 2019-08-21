package com.xd.shardingtable.entity.user.result;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.StringJoiner;

/**
 * @author wind_
 * @desc 获取用户结果
 * @date 2019/8/4
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResult {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private Integer age;
    /**
     * 密码
     */
    private String password;
    /**
     * 密码盐
     */
    private String salt;
    /**
     * 状态 0-正常,1-锁定
     */
    private Integer status;
    /**
     * 头像地址
     */
    private String avatar;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
}
