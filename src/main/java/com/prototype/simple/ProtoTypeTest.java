package com.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * author:曲终、人散
 * Date:2019/4/7 16:48
 */
public class ProtoTypeTest {

    public static void main(String[] args) {
        PojoProtoTypeA pojoProtoTypeA = new PojoProtoTypeA();
        pojoProtoTypeA.setAge(23);
        pojoProtoTypeA.setName("林青霞");
        List<String> hobbits = new ArrayList();
        pojoProtoTypeA.setHobbits(hobbits);


        Client client = new Client();
        PojoProtoTypeA pojoProtoTypeACopy = (PojoProtoTypeA)client.clientCopy(pojoProtoTypeA);
        System.out.println(pojoProtoTypeA);

        System.out.println("克隆对象引用对象的值："+pojoProtoTypeACopy.getHobbits());
        System.out.println("原对象引用对象的值："+pojoProtoTypeA.getHobbits());
        System.out.println("比较引用对象地址："+(pojoProtoTypeA.getHobbits() == pojoProtoTypeACopy.getHobbits()));



    }
}
