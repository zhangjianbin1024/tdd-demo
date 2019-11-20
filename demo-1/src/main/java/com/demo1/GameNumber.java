package com.demo1;

import static java.lang.String.valueOf;

/**
 * @author zh
 * @date 2019/8/10/010 17:56
 */
public class GameNumber {
    private int value;

    public GameNumber(int value) {
        this.value = value;
    }


    public String say() {

        //shift + f6 修改相同名字的方法、字段等
        if (isDividableBy(3) && isDividableBy(5)) {
            return "fizzbuzz";
        }

        if (isDividableBy(3)) {
            return "fizz";
        }

        if (isDividableBy(5)) {
            return "buzz";
        }

        return valueOf(value);
    }

    private boolean isDividableBy(int base) {
        return value % base == 0;
    }
}
