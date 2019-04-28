package com.fox.api.convert;/**
 * Created by sh00859 on 2019/4/28.
 */

import java.io.Serializable;

/**
 * 父类
 *
 * @author
 * @create 2019-04-28 9:47
 **/
public class Person implements Serializable{

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}