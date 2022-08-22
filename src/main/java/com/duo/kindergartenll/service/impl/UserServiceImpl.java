package com.duo.kindergartenll.service.impl;


import com.duo.kindergartenll.mapper.UserMapper;
import com.duo.kindergartenll.model.User;
import com.duo.kindergartenll.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-20 14:02:11
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    /*分页查询*/
    @Override
    public Map<String,Object> findAll(int pageno, int pagesize,String user_name) {
        if(user_name !=null){
            user_name=user_name+"%";
        }
        List<User> all = userMapper.findByUser((pageno-1)*pagesize, pagesize,user_name);
        int count =userMapper.getCount(user_name);
        Map<String,Object> map=new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",count);
        map.put("data",all);
        return map;
    }
    /*记录总条数*/
    @Override
    public int getCount(String user_name) {
        if(user_name !=null){
            user_name=user_name+"%";
        }
        return userMapper.getCount(user_name);
    }
}
