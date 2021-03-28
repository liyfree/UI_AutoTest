package com.ly.common.util;

/**
 * Created by huangyan on 2021/3/21下午10:37.
 */

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: AutoTestNGDemo
 * @description: 解析监听器，
 * 每解析一行会回调invoke()方法。
 * 整个excel解析结束会执行doAfterAllAnalysed()方法
 * @author: liyang
 * @create: 2021-03-21 22:37
 **/
public class ExcelListener extends AnalysisEventListener {

    private static final Logger logger = LoggerFactory.getLogger(ExcelListener.class);

    private List<Object> datas = new ArrayList<Object>();

    /**
     * 每读一行数据回调此方法
     *
     * @param object          一行数据对象
     * @param analysisContext
     */
    public void invoke(Object object, AnalysisContext analysisContext) {
        logger.info("读取一行excel数据：" + object.toString());
        datas.add(object);
        //这里进行业务处理
        //doSomething(object);
    }

    /**
     * 自定义业务处理
     *
     * @param object
     */
    private void doSomething(Object object) {
        //1、入库调用接口
        //doSomething(object);
    }


    /**
     * 所有解析结束后调用次方法
     *
     * @param analysisContext
     */
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        logger.info("excel所有数据读取完成！");
    }


    /**
     * 返回读取数据集合
     *
     * @return
     */
    public List<Object> getDatas() {
        return datas;
    }
}
