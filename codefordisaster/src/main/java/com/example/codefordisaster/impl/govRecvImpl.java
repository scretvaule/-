package com.example.codefordisaster.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.codefordisaster.Entity.govRecv;
import com.example.codefordisaster.Service.govRecvService;
import com.example.codefordisaster.mapper.govRecvmapper;
import org.springframework.stereotype.Repository;

@Repository
public class govRecvImpl extends ServiceImpl<govRecvmapper, govRecv> implements govRecvService {
}
