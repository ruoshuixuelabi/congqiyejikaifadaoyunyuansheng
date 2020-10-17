package top.wisely.springfundamentals.beans.annotated;

import org.springframework.stereotype.Component;

/**
 * 当类注解为@Component、@Service、@Repository或@Controller时，
 * Spring容器会自动扫描（通过@ComponentScan实现，Spring Boot已经做好了配置），
 * 并将它们注册成受容器管理的Bean。
 *
 * @author mzk
 */
@Component
public class SomeService {
    public void doSomething() {
        System.out.println("我做了一些工作");
    }
}