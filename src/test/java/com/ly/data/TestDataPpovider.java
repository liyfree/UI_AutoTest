package com.ly.data;

import org.testng.annotations.DataProvider;
/**
 * Created by huangyan on 2021/3/21下午4:00.
 */

/**
 * @program: AutoTestNGDemo
 * @description: 测试数据提供
 * @author: liyang
 * @create: 2021-03-21 16:00
 **/
public class TestDataPpovider {

    //todo:后续数据来源改造为从文件读取

    @DataProvider(name = "searchData")
    public static Object[][] searchText() {
        return new Object[][]{
                {"NBA"},
                {"TestNG"},
                {"selenium"}
        };
    }
}
