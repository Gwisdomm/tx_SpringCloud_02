package com.gao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @program: tx_springcloud_02
 * @description: 实体类
 * @author: gaowz
 * @create: 2020-12-11 10:28
 **/
@Entity(name = "tb_student")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "id",length = 32)
    private Long id;

    @Column(length = 50)
    private String name;
    @Column(length = 3)
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
