package com.duo.kindergartenll.service;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-20 14:01:34
 */
public interface UserService {
    /*分页查询*/
    public Map<String,Object> findAll(int pageno, int pagesize, String user_name);
    /*记录总条数*/
    public int getCount(@Param("user_name")String user_name);
}
