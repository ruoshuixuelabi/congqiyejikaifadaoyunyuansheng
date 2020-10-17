package top.wisely.springfundamentals.beans.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import top.wisely.springfundamentals.beans.pojo.AnotherService;

@Component
public class UseQualifierService {
    /**
     * 通过@Qualifier("anotherService")指定使用anotherService
     */
    @Autowired
    @Qualifier("anotherService")
    private AnotherService service;

    public void doSomething() {
        System.out.println("wyf".equals(service.getPerson()));
    }
}