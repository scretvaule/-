package com.example.codefordisaster.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.codefordisaster.Entity.disaster;
import com.example.codefordisaster.Service.disasterService;
import com.example.codefordisaster.mapper.disastermapper;
import org.springframework.stereotype.Service;

@Service
public class disasterServiceImpl extends ServiceImpl<disastermapper, disaster> implements disasterService {
}
