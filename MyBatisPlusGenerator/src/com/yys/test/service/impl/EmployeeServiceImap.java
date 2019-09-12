package com.yys.test.service.impl;

import com.yys.test.entity.Employee;
import com.yys.test.mapper.EmployeeDao;
import com.yys.test.service.EmployeeService;
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
public class EmployeeServiceImap extends ServiceImpl<EmployeeDao, Employee> implements EmployeeService {

}
