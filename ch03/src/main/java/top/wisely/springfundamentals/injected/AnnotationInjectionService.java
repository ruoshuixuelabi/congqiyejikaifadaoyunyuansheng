package top.wisely.springfundamentals.injected;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.wisely.springfundamentals.beans.annotated.SomeService;
import top.wisely.springfundamentals.beans.annotated.SomeService2;

/**
 * AnnotationInjectionService需要使用SomeService和AnotherService的Bean，
 * 我们只需在AnnotationInjectionService构造器上注解@Autowired，即可注入参数里需要的Bean。
 * @author mzk
 */
@Service
public class AnnotationInjectionService {
    private SomeService someService;

    private SomeService2 someService2;

    @Autowired
    public AnnotationInjectionService(SomeService someService, SomeService2 someService2) {
        this.someService = someService;
        this.someService2 = someService2;
    }

    public void doMyThing() {
        someService.doSomething();
        someService2.doSomething();
    }
}