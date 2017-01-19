package com.abin.lee.test;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: abin
 * Date: 16-12-7
 * Time: 下午3:16
 * To change this template use File | Settings | File Templates.
 */
public class CommonTest {

    @Test
    public void testReplace(){
        String ret = "中国,北京,北京市,顺义区";
        if (ret != null) {
            ret = ret.replaceAll("中国,", "");
            ret = ret.replaceAll(",", "");
        }
        System.out.println("ret="+ret);
    }


}
