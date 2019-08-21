package com.xd.shardingtable.service.Impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xd.shardingtable.entity.user.vo.User;
import com.xd.shardingtable.mapper.UserMapper;
import com.xd.shardingtable.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jack
 * @since 2019-08-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    @Transactional(rollbackFor = Exception.class,readOnly = false,propagation = Propagation.REQUIRED)
    public boolean save(User entity) {
        boolean save = super.save(entity);
        throw new RuntimeException("就是出错怎么样");
    }

    @Override
    public List<User> getUserList() {
        return baseMapper.selectList(Wrappers.<User>lambdaQuery());
    }
}
