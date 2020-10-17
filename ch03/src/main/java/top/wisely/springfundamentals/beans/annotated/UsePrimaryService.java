package top.wisely.springfundamentals.beans.annotated;

import org.springframework.stereotype.Component;
import top.wisely.springfundamentals.beans.pojo.AnotherService;

/**
 * 因为现在使用的 service不符合按照名称自动注入，所以是按照类型自动注入的。
 * 因为primaryAnotherService注解了@Primary，所以使用primaryAnotherService这个Bean。
 * @author mzk
 */
@Component
public class UsePrimaryService {
    private AnotherService service;

    public UsePrimaryService(AnotherService service) {
        this.service = service;
    }

    public void doSomething() {
        System.out.println("foo".equals(service.getPerson()));
    }
}