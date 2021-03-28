package com.ly.common;

/**
 * Created by huangyan on 2021/3/21上午9:59.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @program: AutoTestNGDemo
 * @description: 页面基类，每个页面类都需要继承该类
 * @author: liyang
 * @create: 2021-03-21 09:59
 **/
public class BasePage {

    private final static Logger logger = LoggerFactory.getLogger(BasePage.class);


    private Browser browser;

    public BasePage(Browser browser) {
        this.browser = browser;
    }

    /**
     * 封装页面基类查找元素方法
     *
     * @param by
     * @return
     */
    public WebElement findElement(By by) {
        return browser.getDriver().findElement(by);
    }

    /**
     * 封装查找页面元素集合方法
     *
     * @param by
     * @return
     */
    public List<WebElement> findElements(By by) throws InterruptedException {
        return browser.getDriver().findElements(by);
    }

    /**
     * 封装获取页面title方法
     *
     * @return
     */
    public String getPageTitle() {
        return browser.getDriver().getTitle();
    }

    public String getURL() {
        return browser.getDriver().getCurrentUrl();
    }


    public String getPageSource() {
        return browser.getDriver().getPageSource();
    }


    /**
     * 封装click
     *
     * @param element
     */
    public void click(WebElement element) {
        if (element != null) {
            element.click();
        } else {

        }
    }

    /**
     * 封装页面sendeys方法
     *
     * @param element
     * @param text
     */
    public void sendKeys(WebElement element, String text) {
        if (element != null) {
            element.clear();
            element.sendKeys(text);
        } else {
            logger.info("页面元素不存在：");
        }
    }


    public void back() {
        browser.getDriver().navigate().back();
    }

    public void forward() {
        browser.getDriver().navigate().forward();
    }


}
