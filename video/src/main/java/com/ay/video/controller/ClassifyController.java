package com.ay.video.controller;

import com.ay.video.entity.Classify;
import com.ay.video.service.ClassifyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController(value = "/classify")
@Api(value = "ClassifyController",tags={"类目接口"})
public class ClassifyController {

    @Autowired
    ClassifyService classifyService;

    @ApiOperation(value="查询类目列表", notes="查询类目列表")
    @PostMapping(value = "/list")
    public List<Classify> list(){
        return classifyService.queryAll();
    }
}
