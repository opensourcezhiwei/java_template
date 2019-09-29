package com.ay.video.controller;

import com.ay.video.entity.Video;
import com.ay.video.service.VideoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/video")
@Api(value = "VideoController",tags={"视频接口"})
public class VideoController {
    @Autowired
    VideoService videoService;

    @ApiOperation(value="根据类目查询视频列表", notes="根据类目查询视频列表")
    @PostMapping(value = "/getClassifiedVideo")
    public List<Video> getClassifiedVideo(@RequestBody Integer classifyId){
        return videoService.queryVideoByClassifyId(classifyId);
    }
}
