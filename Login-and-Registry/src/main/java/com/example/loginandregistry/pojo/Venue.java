package com.example.loginandregistry.pojo;
/**
 * 创建实体
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venue {
    private String appointmentdate;
    private String name;
    private int status;
    private String tag;



}
