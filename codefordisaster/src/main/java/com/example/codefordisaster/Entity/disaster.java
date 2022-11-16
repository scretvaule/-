package com.example.codefordisaster.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class disaster {
    @TableId(type = IdType.ASSIGN_ID)
    private Long disasterId;
    private String disasterCode;
    private String govSendId;
    private String location;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date disasterTime;
    private String sourceBig;
    private String sourceSmall;
    private String contentType;
    private String content;
    private String disasterBig;
    private String disasterMiddle;
    private String disasterSmall;
}
