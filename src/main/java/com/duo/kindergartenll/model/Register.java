package com.duo.kindergartenll.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 哆哆
 * @description
 * @date 2022-08-17 17:25:29
 * 记录表
 */
@Data//自动生成get和set的方法
@AllArgsConstructor//全参构造参数
@NoArgsConstructor//无参构造参数
public class Register {
    private String id;
    private int child_id;//学员id
    private String record_type;//类型(接、送）PICKUP-接 SEND-送
    private  int guardian_id;//接送人id
    private String guardian_name;//接送人
    private String child_name;//学员名称
    private String  relation;//接送人关系
    private Long record_time;//接送时间
}
