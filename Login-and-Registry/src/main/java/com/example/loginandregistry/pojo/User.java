package com.example.loginandregistry.pojo;
import lombok.AllArgsConstructor;
import lombok.Data;   //自动构造setter，getter，builder，@RequiredArgsConstructor，@ToString，@EqualsAndHashCode
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 创建实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id; //主键
    private String email; //邮箱
    private String password; //密码使用md5+盐加密
    private String salt;
    private LocalDateTime activationTime;
    private String confirmCode;
    private Byte isValid;
}
