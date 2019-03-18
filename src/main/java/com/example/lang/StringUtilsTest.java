package com.example.lang;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 *  lang3的字符串处理工具类
 * @author: wuxinxin
 * @date: 2019/3/18
 */
public class StringUtilsTest {

    @Test
    public void test(){
        /**
         * 测试几个常量
         *
         * 1.空字符串
         * 2.包含一个" "空白符
         */
        String s=StringUtils.EMPTY;

        s=StringUtils.SPACE;


        //isEmpty判断字符串是否为空（null 和 ""）
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(" "));
    }

}
