package com.ay.video.service;

import com.ay.video.entity.Video;

import java.util.List;

public interface VideoService {
    List<Video> queryVideoByClassifyId(Integer classifyId);
}
