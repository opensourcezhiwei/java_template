package com.ay.video.service.impl;

import com.ay.video.dao.ClassifyDao;
import com.ay.video.entity.Classify;
import com.ay.video.service.ClassifyService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    ClassifyDao classifyDao;

    @Override
    public List<Classify> queryAll() {
        return classifyDao.selectList(new QueryWrapper<>());
    }
}
