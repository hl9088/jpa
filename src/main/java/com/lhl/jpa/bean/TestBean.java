package com.lhl.jpa.bean;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by lihongli on 2019/3/1
 */
@Table(name = "test")
@Entity
public class TestBean implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "test_name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
