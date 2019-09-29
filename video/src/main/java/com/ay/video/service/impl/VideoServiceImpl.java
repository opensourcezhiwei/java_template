package com.ay.video.service.impl;

import com.ay.video.constant.AppConstant;
import com.ay.video.dao.VideoDao;
import com.ay.video.entity.Video;
import com.ay.video.service.VideoService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    VideoDao videoDao;
    @Override
    public List<Video> queryVideoByClassifyId(Integer classifyId) {
        QueryWrapper<Video> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(Video::getClassifyId,classifyId).eq(Video::getIsPush,AppConstant.Video.IS_PUSH_UPPER_SHELF);
        return videoDao.selectList(queryWrapper);
    }
}
