package com.example.codefordisaster.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.codefordisaster.Entity.manager;
import com.example.codefordisaster.Service.managerService;
import com.example.codefordisaster.mapper.managermapper;
import org.springframework.stereotype.Repository;

@Repository
public class managerServiceImpl extends ServiceImpl<managermapper, manager> implements managerService {
}
