package com.ly.common.util;

/**
 * Created by huangyan on 2021/3/21下午10:50.
 */

import com.alibaba.excel.EasyExcel;

import java.util.List;

/**
 * @program: AutoTestNGDemo
 * @description:xcel读写工具类
 * @author: liyang
 * @create: 2021-03-21 22:50
 **/
public class ExcelUtils {

    /**
     * 读取excel到list
     *
     * @param filePath excel路径
     * @return list
     */
    public static List<Object> readExcel(String filePath) {
        List<Object> list;
        ExcelListener listener = new ExcelListener();

        /***
         * 可设置读取的Sheet索引或名称
         * EasyExcel.read(filePath,listener).sheet(1,"Sheet2").doRead();
         */
        EasyExcel.read(filePath, listener).sheet().doRead();
        list = listener.getDatas();
        return list;
    }

}
