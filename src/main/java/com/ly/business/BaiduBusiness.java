package com.ly.business;

/**
 * Created by huangyan on 2021/3/21上午11:49.
 */

import com.ly.common.Browser;
import com.ly.page.BaiduPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @program: AutoTestNGDemo
 * @description:
 * @author: liYang
 * @create: 2021-03-21 11:49
 **/
public class BaiduBusiness {
    private final static Logger logger = LoggerFactory.getLogger(BaiduBusiness.class);

    private BaiduPage baiduPage;

    public BaiduBusiness(Browser browser) {
        this.baiduPage = new BaiduPage(browser);
    }


    /**
     * 百度搜索内容业务
     *
     * @param text
     * @return
     */
    public String searchText(String text) {
        logger.info("百度输入框输入：" + text);
        baiduPage.searchInput().clear();
        baiduPage.searchInput().sendKeys(text);
        //baiduPage.takeScreenShot();
        logger.warn("点击搜索按钮");
        baiduPage.searchBtn().click();
        return baiduPage.getPageTitle();
    }
}
