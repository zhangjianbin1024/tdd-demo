package com.demo1;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * 1.理解需求
 * 2.先写测试，再实现
 * 3.先断言返回值，运行测试--->> 失败 --->> 再修改实现的具体逻辑
 *
 * @author zh
 * @date 2019/8/10/010 17:39
 */
public class CalculatorTest {

    /**
     * 1.需要一个计算器产品
     * 2.对计算器写测试用例
     * 3.计算品需要一个加法
     */
    @Test
    public void should_two_numbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);
        assertThat(result, is(3));

    }


}
