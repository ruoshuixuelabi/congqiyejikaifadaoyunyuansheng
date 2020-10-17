package top.wisely.springfundamentals.injected;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wisely.springfundamentals.beans.annotated.SomeService2;
import top.wisely.springfundamentals.beans.pojo.AnotherService;
import top.wisely.springfundamentals.beans.annotated.SomeService;

/**
 * 在构造器上注解注入是Spring推荐的注入方式，当然，也可以通过在属性上注解@Autowired来注入Bean。
 *
 * @author mzk
 */
@Service
public class AnnotationPropertyInjectionService {
    @Autowired
    private SomeService someService;
    @Autowired
    private SomeService2 someService2;

    public void doMyThing() {
        someService.doSomething();
        someService2.doSomething();
    }
}