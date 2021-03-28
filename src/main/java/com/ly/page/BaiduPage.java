package com.ly.page;

/**
 * Created by huangyan on 2021/3/21上午11:40.
 */

import com.ly.common.BasePage;
import com.ly.common.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @program: AutoTestNGDemo
 * @description: 页面定位元素
 * @author: liyang
 * @create: 2021-03-21 11:40
 **/
public class BaiduPage extends BasePage {


    public BaiduPage(Browser browser) {
        super(browser);
    }

    /**
     * 定位页面输入框
     *
     * @param
     * @return
     */
    public WebElement searchInput() {
        return this.findElement(By.id("kw"));
    }

    /**
     * 定位搜索按钮
     *
     * @return
     */
    public WebElement searchBtn() {
        return this.findElement(By.id("su"));
    }
}
