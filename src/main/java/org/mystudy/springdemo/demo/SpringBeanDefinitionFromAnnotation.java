package org.mystudy.springdemo.demo;

import org.springframework.stereotype.Component;

/**
 * @author fntp
 * @date 2025/2/20
 * @apiNote
 */
@Component
public class SpringBeanDefinitionFromAnnotation {

    private String beanName;

    public String getBeanName() {
        return beanName;
    }


}
