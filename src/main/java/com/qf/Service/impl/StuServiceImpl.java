package com.qf.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qf.Service.StuService;
import com.qf.dao.StuMapper;
import com.qf.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wzp
 * @Date 2019/9/25
 */
@Service
public class StuServiceImpl extends ServiceImpl<StuMapper,Student> implements StuService {
    @Autowired
    private StuMapper stuMapper;
}
