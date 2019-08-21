package com.xd.shardingtable.entity.user.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xd.shardingtable.annotation.Phone;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author jack
 * @since 2019-08-19
 */
@TableName("user")
@Data
@Accessors(chain = true)
public class User implements Serializable {

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
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;
}
