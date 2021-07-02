package com.mx.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author MX
 * @create 2021/7/2 16:09
 * 此模块暂不作为入门理解，后续更新深入理解
 */
public class StandardsBean implements FactoryBean<FactoryBeans> {

    @Override
    public FactoryBeans getObject() throws Exception {
        FactoryBeans factoryBeans=new FactoryBeans();
        factoryBeans.setStr("工厂bean正常生产中");
        //类操作
        return factoryBeans;
        //返回需要转换的类型
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

}
