package com.example.codefordisaster.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.codefordisaster.Entity.govSend;
import com.example.codefordisaster.Service.govSendService;
import com.example.codefordisaster.mapper.govSendmapper;
import org.springframework.stereotype.Repository;

@Repository
public class govSendServiceImpl extends ServiceImpl<govSendmapper, govSend> implements govSendService {
}
