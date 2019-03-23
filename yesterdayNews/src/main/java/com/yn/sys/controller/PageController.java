package com.yn.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by CGB on 2019/3/22.
 */
@Controller
public class PageController {
    @RequestMapping("starter")
    public String starter(){
        return "starter";
    }
}
