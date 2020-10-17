package top.wisely.springfundamentals.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import top.wisely.springfundamentals.beans.annotated.LifeService;

//@Component
public class GlobalPostProcessor implements BeanPostProcessor {
    /**
     * 初始化之前处理
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("----" + beanName + "----");
        System.out.println("----" + beanName.getClass() + "----");
        return bean;
    }

    /**
     * 初始化之后处理
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof LifeService) {
            System.out.println("++++" + beanName + "++++");
            System.out.println("++++" + beanName.getClass() + "++++");
        }
        return bean;
    }
}