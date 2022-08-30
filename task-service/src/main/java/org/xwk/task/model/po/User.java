package org.xwk.task.model.po;


import lombok.Data;

/**
 * 用户
 *
 * @author xu wen kai
 * @date 2022/08/30 16:05
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
