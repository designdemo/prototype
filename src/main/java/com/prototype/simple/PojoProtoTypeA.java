package com.prototype.simple;

import lombok.Data;

import java.util.List;

/**
 * author:曲终、人散
 * Date:2019/4/7 16:39
 */
@Data
public class PojoProtoTypeA implements ProtoType {

    private Integer age;
    private String name;
    private List<String> hobbits;

    public ProtoType clone() {
        PojoProtoTypeA pojoProtoTypeA = new PojoProtoTypeA();
        pojoProtoTypeA.setAge(this.age);
        pojoProtoTypeA.setName(this.name);
        pojoProtoTypeA.setHobbits(this.hobbits);
        return pojoProtoTypeA;
    }
}
