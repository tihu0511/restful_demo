package org.jigang.pojos.test;

/**
 * Created by wujigang on 16/7/2.
 */
public class Foo {
    private Integer id;
    private String name;

    public Foo(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

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
