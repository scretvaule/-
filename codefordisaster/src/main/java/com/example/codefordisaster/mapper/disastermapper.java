package com.example.codefordisaster.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.codefordisaster.Entity.disaster;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface disastermapper extends BaseMapper<disaster> {
}
