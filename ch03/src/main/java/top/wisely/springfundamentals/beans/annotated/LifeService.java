package top.wisely.springfundamentals.beans.annotated;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 我们可以定制Bean在容器中的初始化行为和销毁行为。
 * 注解配置：使用@PostConstruct和@PreDestroy。
 * @author mzk
 */ //@Service
//@Lazy
public class LifeService {

    public LifeService() {
        System.out.println("LifeService:正在构造");
    }

    @PostConstruct
    public void exeAfterConstruct() {
        System.out.println("LifeService:在构造完成后执行");
    }

    @PreDestroy
    public void exeBeforeDestroy() {
        System.out.println("LifeService:在销毁之前执行");
    }
}