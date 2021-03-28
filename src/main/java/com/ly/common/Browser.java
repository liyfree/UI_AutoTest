package com.ly.common;

/**
 * Created by huangyan on 2021/3/21上午10:29.
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @program: AutoTestNGDemo
 * @description:
 * @author: liyang
 * @create: 2021-03-21 10:29
 **/
public class Browser {
    private WebDriver driver;

    public Browser(String browserName) {

        //根据参数确定浏览器
        if (browserName.equalsIgnoreCase("chrome")
                || browserName.equals("")) {
            ChromeOptions chromeOptions = new ChromeOptions();
            //设置无头模式，后台运行，不弹出浏览器
            chromeOptions.setHeadless(true);

            //将驱动放入系统变量
            System.setProperty("webdriver.chrome.driver", "src/main/java/com/ly/common/driver/chromedriver");
            this.driver = new ChromeDriver(chromeOptions);
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/main/java/com/ly/common/driver/msedgedriver");
            this.driver = new EdgeDriver();
        }

    }

    /**
     * 返回driver
     *
     * @return
     */
    public WebDriver getDriver() {
        return driver;
    }


    /**
     * 访问URL
     *
     * @param url
     */
    public void openUrL(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }


    /**
     * 关闭浏览器
     */
    public void quitBrowser() {
        this.driver.quit();
    }
}
