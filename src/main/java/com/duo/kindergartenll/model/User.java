package com.duo.kindergartenll.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-17 17:49:39
 * 用户
 */
@Data//自动生成get和set的方法
@AllArgsConstructor//全参构造参数
@NoArgsConstructor//无参构造参数
public class User {
    private String userId;//小程序用户id
    private String userName;//用户名
    private String userPortrait;//用户头像
    private String userPhone;//用户手机号
    private int  isDelete;//是否删除
    private Long createTime;//创建时间
    private Long updateTime;//更新时间
    private int guardianId;//监护人id

}
