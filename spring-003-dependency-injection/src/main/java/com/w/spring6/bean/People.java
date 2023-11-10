package com.w.spring6.bean;
import java.util.List;


public class People {
    // 一个人有多个名字
    private List<String> names;

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "People{" +
                "names=" + names +
                '}';
    }
}
