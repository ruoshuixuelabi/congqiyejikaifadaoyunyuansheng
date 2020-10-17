package top.wisely.springfundamentals.injected;

import org.springframework.stereotype.Service;
import top.wisely.springfundamentals.beans.annotated.SomeService;

/**
 * 如果Bean只有一个构造器，则可以直接省略@Autowired注解。若Bean有多个构造器，则需注解一个构造器用来注入，示例如下。
 *
 * @author mzk
 */
@Service
public class AnnotationOneInjectionService {
    private SomeService someService;

    public AnnotationOneInjectionService(SomeService someService) {
        this.someService = someService;
    }

    public void doMyThing() {
        someService.doSomething();
    }
}