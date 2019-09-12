package com.yys.test.service.impl;

import com.yys.test.entity.User;
import com.yys.test.mapper.UserDao;
import com.yys.test.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 杨永生
 * @since 2019-07-03
 */
@Service
public class UserServiceImap extends ServiceImpl<UserDao, User> implements UserService {

}
