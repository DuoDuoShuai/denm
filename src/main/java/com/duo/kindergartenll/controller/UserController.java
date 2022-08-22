package com.duo.kindergartenll.controller;

import com.duo.kindergartenll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-20 14:12:52
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    /*分页查询*/
    @RequestMapping("findAll")
    @ResponseBody
    public Map<String, Object> findAll(int page, int limit, String userName) {
        Map<String, Object> all = userService.findAll(page, limit, userName);
        return all;
    }
}
