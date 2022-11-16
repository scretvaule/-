package com.example.codefordisaster.Controller;

import com.example.codefordisaster.Entity.disaster;
import com.example.codefordisaster.Service.disasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disaster")
public class deal_disaster {
    @Autowired
    disasterService disasterService;
    @RequestMapping("/receviceinfo")
    public String receviceinfo(@RequestBody disaster disaster){
        System.out.println(disaster);
        disasterService.save(disaster);
        return "success";
    }
}
