package com.ly.common.util;

/**
 * Created by huangyan on 2021/3/22下午10:49.
 */

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @program: AutoTestNGDemo
 * @description:
 * @author: liyang
 * @create: 2021-03-22 22:49
 **/
public class ScreenShotUtils {
    public static void takeScreenShot(WebDriver driver) {
        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ss"));
        String path = "src/test/java/com/ly/screenshot/";
        String fileName = path + "_" + format + ".png";
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            //复制内容到指定文件中
            FileUtils.copyFile(srcFile, new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void takeScreenShot(WebDriver driver, String str) {
        String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH:mm:ss"));
        String path = "src/main/java/com/ly/screenshot/";
        String fileName = path + str + "_" + format + ".png";
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            //复制内容到指定文件中
            FileUtils.copyFile(srcFile, new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
