package com.fox.api.convert;/**
 * Created by sh00859 on 2019/4/28.
 */

import java.io.Serializable;

/**
 * 子类
 * 注意:当子类有属性与父类相同时，如果设置了子类的相同属性的值在接收方是接收不到值的(父类的值会替换掉子类的)
 *
 * 获取当前class的所有字段，接着获取父类的所有字段。序列化的时候，所有字段都放在一个ArrayList里，
 * 然后依次写入到二进制流中，反序列化的时候，所有字段放在了一个HashMap里，HashMap的key不能重复，
 * 悲剧就出现了，如果子类和父类有同名的字段就会有问题，父类的值会把子类的值覆盖掉。
 *
 * @author
 * @create 2019-04-28 9:47
 **/
public class Son extends Person implements Serializable {

    private String id;
    private String name;

    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Son(String id, String name) {
        this.id = id;
        this.name = name;
    }
}