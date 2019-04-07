package com.prototype.deep;

import java.io.Serializable;

/**
 * author:曲终、人散
 * Date:2019/4/7 17:01
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }

}
