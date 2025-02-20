package org.mystudy.springdemo.config;

import org.mystudy.springdemo.demo.BeanPostProcessorDemo;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fntp
 * @date 2025/2/20
 * @apiNote
 */
@Configuration
public class AppConf {

    @Bean
    public ApplicationListener applicationListener() {
        return new ApplicationListener() {
            @Override
            public void onApplicationEvent(ApplicationEvent event) {
                System.out.println("接收到了一个事件");
            }
        };
    }

    /**
     * 非静态 BeanPostProcessor 工厂方法导致配置类实例化过早，破坏了 Bean 初始化顺序。
     * 这里需要加上static
     * @return
     */
    @Bean
    public static BeanPostProcessorDemo beanPostProcessorDemo() {
        return new BeanPostProcessorDemo();
    }
}
