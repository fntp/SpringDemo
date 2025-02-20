package org.mystudy.springdemo;

import org.mystudy.springdemo.config.AppConf;
import org.mystudy.springdemo.demo.SpringBeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

/**
 * @author fntp
 * @date 2025/2/20
 * @apiNote
 */
public class TestMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConf.class);
        // (1) 生成BeanDefinition注册bean
        //AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        //beanDefinition.setBeanClass(SpringBeanDefinition.class);
        //beanDefinition.setInitMethodName("getBeanName");
        //context.registerBeanDefinition("springBeanDefinition", beanDefinition);
        //System.out.println(context.getBean("springBeanDefinition"));

        // (2) 通过扫描包生成BeanDefinition然后注册bean
        //ClassPathBeanDefinitionScanner classPathBeanDefinitionScanner = new ClassPathBeanDefinitionScanner(context);
        //classPathBeanDefinitionScanner.scan("org.mystudy.springdemo.demo");
        //System.out.println(context.getBean("springBeanDefinitionFromAnnotation"));

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
        beanDefinition.setBeanClass(SpringBeanDefinition.class);
        beanFactory.registerBeanDefinition("springBeanDefinition", beanDefinition);

        System.out.println(beanFactory.getBean("springBeanDefinition"));
    }
}
