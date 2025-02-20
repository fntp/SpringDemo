package org.mystudy.springdemo.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author fntp
 * @date 2025/2/20
 * @apiNote
 */
@Component
public class BeanPostProcessorDemo implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化前");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化后");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
