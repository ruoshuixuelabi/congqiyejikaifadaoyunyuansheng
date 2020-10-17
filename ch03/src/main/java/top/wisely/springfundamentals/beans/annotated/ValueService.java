package top.wisely.springfundamentals.beans.annotated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:author.properties")
public class ValueService {
    /**
     * Java对象使用#
     */
    @Value("#{1 + 2}")
    private Integer add;
    /**
     * 可以在表达式中进行比较运算，包括<、>、==、!=、<=、>=、lt、gt、eq、ne、le和ge。
     */
    @Value("#{1 == 2}")
    private boolean compare;
    /**
     * 可以在表达式中进行逻辑运算，包括and、or、not、&&、||和 !。
     */
    @Value("#{1 == 2 || 1 == 1}")
    private boolean compareOr;
    /**
     * 使用三元运算符?:可进行条件运算。
     */
    @Value("#{1 < 2 ? 'wyf' : 'www'}")
    private String name;
    /**
     * 使用matches可判断字符是否符合正则表达式。
     */
    @Value("#{'1' matches '\\d+' }")
    private boolean isValidNumber;
    /**
     * 可以通过#{bean名.方法名(参数)}来调用。
     */
    @Value("#{forValueService.generate('wyf')}")
    private String beanReturn;

    @Value("${author.name}")
    private String authorName;

    @Value("${os.name}")
    private String osName;

    public void doSomething() {
        System.out.println("数学运算add的值是：" + add);
        System.out.println("逻辑运算compare的值是" + compare);
        System.out.println("逻辑运算compareOr的值是" + compareOr);
        System.out.println("条件运算name的值是：" + name);
        System.out.println("正则匹配isValidNumber的值是：" + name);
        System.out.println("调用Bean的返回值beanReturn值是：" + beanReturn);
        System.out.println("属性查询外部配置文件authorName值是：" + authorName);
        System.out.println("属性查询操作系统环境变量authorName值是：" + osName);
    }
}