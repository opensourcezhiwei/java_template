package com.ay.video.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * 类目实体
 */
@NoArgsConstructor
@Getter
@Setter
@TableName("t_classify")
public class Classify {
    /**
     *  主键ID
     */
    @TableId("id")
    private Integer id;
    /**
     *  分类名称
     */
    @TableField("name")
    private String name;
    /**
     *  图片类型 1=系统 2=外部
     */
    @TableField("icon_type")
    private Byte iconType;
    /**
     *  分类图标
     */
    @TableField("classify_icon")
    private String classifyIcon;
    /**
     *  创建人
     */
    @TableField("create_by")
    private Integer createBy;
    /**
     *  创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     *  更新人
     */
    @TableField("update_by")
    private Integer updateBy;
    /**
     *  更新时间
     */
    @TableField("update_time")
    private Date updateTime;
}
