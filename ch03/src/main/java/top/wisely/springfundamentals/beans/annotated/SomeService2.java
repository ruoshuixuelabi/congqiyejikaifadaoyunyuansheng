package top.wisely.springfundamentals.beans.annotated;

import org.springframework.stereotype.Service;

/**
 * 注解@Component、@Service、@Repository和@Controller在当前示例中是完全等同的。
 * @author mzk
 */
@Service
public class SomeService2 {
    public void doSomething() {
        System.out.println("我也做了一些工作");
    }
}