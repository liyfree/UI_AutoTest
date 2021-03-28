package com.ly.listener;

/**
 * Created by huangyan on 2021/3/28上午11:58.
 */

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @program: AutoTestNGDemo
 * @description: 重试监听器
 * @author: liyang
 * @create: 2021-03-28 11:58
 **/
public class RetryListener implements IAnnotationTransformer {
    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        //IRetryAnalyzer retryAnalyzer = iTestAnnotation.getRetryAnalyzer();
        //if (null == retryAnalyzer) {
        //    iTestAnnotation.setRetryAnalyzer(MyRetryAnalyzer.class);
        //}
        //Class<? extends IRetryAnalyzer> retryAnalyzerClass = iTestAnnotation.getRetryAnalyzerClass();
        //if (retryAnalyzerClass == null) {
        //    iTestAnnotation.setRetryAnalyzer(RetryAnalyzer.class);
        //}
        iTestAnnotation.setRetryAnalyzer(RetryAnalyzer.class);
    }
}
