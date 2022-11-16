package com.example.codefordisaster.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class manager {
    @TableId(type = IdType.AUTO)
    private Long managerid;
    private String username;
    private String password;
}
