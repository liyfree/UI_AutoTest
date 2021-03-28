package com.ly.testCase;

/**
 * Created by huangyan on 2021/3/21上午11:46.
 */

import com.ly.business.BaiduBusiness;
import com.ly.common.Browser;
import com.ly.common.TestBasePage;
import com.ly.common.util.ExcelUtils;
import com.ly.data.TestDataPpovider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @program: AutoTestNGDemo
 * @description:
 * @author: liyang
 * @create: 2021-03-21 11:46
 **/
public class TestBaiduPagePage extends TestBasePage {
    private final static Logger logger = LoggerFactory.getLogger(TestBaiduPagePage.class);

    private BaiduBusiness baiduBusiness;

    @BeforeClass
    public void beforeClass() throws InterruptedException {
        browser = new Browser("chrome");
        String url = "https://www.baidu.com/";
        baiduBusiness = new BaiduBusiness(browser);
        logger.info("浏览器打开url地址：" + url);
        browser.openUrL(url);
        Thread.sleep(3000);
    }

    @AfterClass
    public void afterClass() {
        browser.quitBrowser();
        logger.info("浏览器关闭！");
    }


    @Test(dataProvider = "searchData", dataProviderClass = TestDataPpovider.class)
    public void testBaiduSearch02(String text) {
        logger.info("输入搜索内容：" + text);
        String title = baiduBusiness.searchText(text);
        logger.info("获取当前页面title：" + title);

        Assert.assertEquals(title, "百度一下，你就知道0");
    }

    @Test
    public void testReadExcel() {
        String path = "src/test/java/com/ly/data/cases.xlsx";
        List<Object> list = ExcelUtils.readExcel(path);
        logger.info(list.toString());
    }
}
