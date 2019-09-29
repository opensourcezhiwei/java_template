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
@TableName("t_video")
public class Video {
    /**
     *  主键ID
     */
    @TableId("id")
    private Integer id;
    /**
     *  视频名称
     */
    @TableField("video_name")
    private String videoCame;
    /**
     *  封面
     */
    @TableField("video_cover")
    private String videoCover;
    /**
     *  简介
     */
    @TableField("brief_content")
    private String briefContent;
    /**
     *  视频链接
     */
    @TableField("video_url")
    private String videoUrl;
    /**
     *  视频上传类型 1=系统 2=外部
     */
    @TableField("video_type")
    private Integer videoType;
    /**
     *  明星ID
     */
    @TableField("star_id")
    private Integer starId;
    /**
     *  分类ID
     */
    @TableField("classify_id")
    private Integer classifyId;
    /**
     *  上映时间
     */
    @TableField("push_time")
    private Date pushTime;
    /**
     *  是否上架 0=否 1=是
     */
    @TableField("is_push")
    private Integer isPush;
    /**
     *  视频封面上传类型 1=系统 2=外部
     */
    @TableField("video_cover_type")
    private Integer videoCoverType;
    /**
     *  播放次数
     */
    @TableField("play_num")
    private Integer playNum;

    /**
     *  失效次数
     */
    @TableField("lose_num")
    private Integer loseNum;
    /**
     *  渠道ID
     */
    @TableField("channel_id")
    private Integer channelId;
    /**
     *  原始链接
     */
    @TableField("source_url")
    private String sourceUrl;
    /**
     *  原始ID
     */
    @TableField("source_id")
    private String sourceId;
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
