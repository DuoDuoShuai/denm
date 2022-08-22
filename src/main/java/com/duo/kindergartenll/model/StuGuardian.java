package com.duo.kindergartenll.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-17 17:40:34
 * 关系表
 */
@Data//自动生成get和set的方法
@AllArgsConstructor//全参构造参数
@NoArgsConstructor//无参构造参数
public class StuGuardian {
    private int id;
    private int guardian_id;//家长id
    private int child_id;//学员id
    private String relation;//学员监护人关系
}
