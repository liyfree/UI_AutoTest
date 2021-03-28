package com.ly.listener;

/**
 * Created by huangyan on 2021/3/28上午11:55.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * @program: AutoTestNGDemo
 * @description: 失败重试
 * @author: liyang
 * @create: 2021-03-28 11:55
 **/
public class RetryAnalyzer implements IRetryAnalyzer {

    private final static Logger logger = LoggerFactory.getLogger(RetryAnalyzer.class);


    private int retryCount = 0;
    private final int MAX_RETRY_COUNT = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < MAX_RETRY_COUNT) {
            retryCount++;
            logger.info("第" + retryCount + "次重试!");
            return true;
        }
        return false;
    }
}
