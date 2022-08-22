package com.duo.kindergartenll.mapper;


import com.duo.kindergartenll.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-18 18:13:54
 */
@Repository
public interface UserMapper {
    public List<User> findByUser(@Param("pageno") int pageno, @Param("pagesize") int pagesize, @Param("userName")String userName);
    /*总计数*/
    public int getCount(@Param("userName")String userName);

}
