package com.duo.kindergartenll.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-17 17:47:34
 */
@Data//自动生成get和set的方法
@AllArgsConstructor//全参构造参数
@NoArgsConstructor//无参构造参数
public class Union {
    private String union_id;//微信平台唯一标识
    private String open_id;//小程序唯一标识
    private String user_id;//微信小程序用户id
}
