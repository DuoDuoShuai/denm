package com.duo.kindergartenll.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-17 17:15:26
 * 监护人
 */
@Data//自动生成get和set的方法
@AllArgsConstructor//全参构造参数
@NoArgsConstructor//无参构造参数
public class Guardian {
    private int id;
    private String guardian_name;//监护人姓名
    private String guardian_phone;//联系电话
    private int  is_show;//是否显示 0-否，1-是
    private int is_delete;//是否删除 0-否，1-是
    private Long create_time;//创建时间
    private Long update_time;//修改时间
}
