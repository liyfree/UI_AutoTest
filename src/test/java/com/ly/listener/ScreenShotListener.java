package com.ly.listener;

/**
 * Created by huangyan on 2021/3/22下午10:23.
 */

import com.ly.common.BasePage;
import com.ly.common.TestBasePage;
import com.ly.common.util.ScreenShotUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * @program: AutoTestNGDemo
 * @description: 监听用例执行失败时，自动截图
 * @author: liyang
 * @create: 2021-03-22 22:23
 **/
public class ScreenShotListener extends TestListenerAdapter {

    private BasePage basePage;

    @Override
    public void onTestFailure(ITestResult tr) {
        //强制转换成TestBasePage基类实例，这样可以获得当前的driver，用来截图
        TestBasePage tpb = (TestBasePage) tr.getInstance();
        WebDriver driver = tpb.browser.getDriver();

        //获取测试用例名称
        String methodName = tr.getMethod().getMethodName();
        //获取测试类全名称
        String instanceName = tr.getInstanceName();
        String str = instanceName + "_" + methodName;

        String simpleName = tpb.getClass().getSimpleName();
        ScreenShotUtils.takeScreenShot(driver, str);
        super.onTestFailure(tr);
    }
}
