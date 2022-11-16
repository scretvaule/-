package com.example.codefordisaster.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.codefordisaster.Entity.govRecvDisaster;
import com.example.codefordisaster.Service.govRecvDisasterService;
import com.example.codefordisaster.mapper.govRecvDisastermapper;
import org.springframework.stereotype.Repository;

@Repository
public class govRecvDisasterServiceImpl extends ServiceImpl<govRecvDisastermapper, govRecvDisaster> implements govRecvDisasterService {
}
