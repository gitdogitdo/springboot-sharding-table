package com.xd.shardingtable.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xd.shardingtable.entity.User;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jack
 * @since 2019-08-19
 */
public interface IUserService extends IService<User> {
    /**
     * 保存用户信息
     * @param entity
     * @return
     */
    @Override
    boolean save(User entity);

    /**
     * 查询全部用户信息
     * @return
     */
    List<User> getUserList();

}
