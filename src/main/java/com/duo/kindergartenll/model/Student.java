package com.duo.kindergartenll.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-17 17:35:00
 * 学员
 */
@Data//自动生成get和set的方法
@AllArgsConstructor//全参构造参数
@NoArgsConstructor//无参构造参数
public class Student {
    private int id;
    private String child_name;//儿童姓名
    private Long birthday;//儿童生日
    private int gender;//儿童性别
    private String student_number;//学员学号
    private String grade;//班级
    private String state;//状态（IN-已入园、OUT-已出园）
    private int is_show;//是否显示 0-否，1-是
    private int is_delete;//是否删除 0-否，1-是
    private Long create_time;//创建时间
    private Long update_time;//修改时间
}
