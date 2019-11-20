package com.demo1;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * 测试开发 推动 产品代码的编写
 *
 * @author zh
 * @date 2019/8/10/010 17:54
 */
public class GameNumberTest {

    @Test
    public void should_say_1_when__value_is_1() {
        int actualValue = 1;
        String expectedWorld = "1";
        assertGameNumber(actualValue, expectedWorld);
    }

    @Test
    public void sould_say_fizz_when_value_is_dividable_by_3() {
        assertGameNumber(3, "fizz");
    }

    @Test
    public void should_sya_buzz_when_value_is_dividable_by_5() {
        assertGameNumber(5, "buzz");
    }


    @Test
    public void should_say_fizzbuzz_when_value_is_dividable_by_6() {
        assertGameNumber(15, "fizzbuzz");
    }


    //ctrl + f6 可以修改方法的变量的顺序
    private void assertGameNumber(int actualValue, String expectedWorld) {
        GameNumber gameNumber = new GameNumber(actualValue);
        assertThat(gameNumber.say(), is(expectedWorld));
    }
}
