package top.wisely.springfundamentals.beans.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * 在类上注解@Configuration（@Component的特例，会被容器自动扫描），
 * 可使类成为配置类。如果使用@Bean标注在类的方法上，则方法的返回值即为Bean的实例。
 * 假如现在有另外一个类。
 *
 * @author mzk
 */
@Getter
@Setter
public class AnotherService {
    private String person;

    public AnotherService(String person) {
        this.person = person;
    }

    public void doAnotherThing() {
        System.out.println(person + "做了另外的事情");
    }
}
