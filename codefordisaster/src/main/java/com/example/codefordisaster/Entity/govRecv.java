package com.example.codefordisaster.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class govRecv {
    @TableId(type = IdType.AUTO)
    private Long govRecvId;
    private String deptName;
    private String govUsername;
    private String govPassword;
    private String location;
}
