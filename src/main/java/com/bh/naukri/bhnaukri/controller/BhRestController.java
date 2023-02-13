package com.bh.naukri.bhnaukri.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bh.naukri.bhnaukri.utils.MappingConstant;

@RestController
@RequestMapping(MappingConstant.BULL_HORN)
public class BhRestController {
    
    @GetMapping(MappingConstant.CHECK)
    public String checking(){
        return "Bh Running ....";
    }
}
