package top.wisely.springfundamentals.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

/**
 * Spring的Environment属性是由PropertySource组成的，我们可以通过@PropertySource指定外部配置文件的路径。
 * 这些配置文件的属性都会以PropertySource的形式注册到Environment中，@PropertySource支持XML格式和properties格式，
 * 不支持Spring Boot下的YAML格式。
 * @author mzk
 */
@Configuration
@PropertySources({
        @PropertySource("classpath:author.properties"),
        @PropertySource("classpath:book.properties")
})
public class ExternalConfig {

    Environment env;

    public ExternalConfig(Environment env) {
        this.env = env;
    }

    @Value("${book.name}")
    private String bookName;

    public void showEnv() {
        System.out.println("作者名字是：" + env.getProperty("author.name"));
        System.out.println("书籍名称是：" + bookName);
    }
}