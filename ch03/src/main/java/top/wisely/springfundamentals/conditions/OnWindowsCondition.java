package top.wisely.springfundamentals.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 通过@Conditional我们可以定义当满足某个特定条件（Condition）时，应该做什么配置。@Conditional
 * 同样可以和@Component、@Configuration、@Bean一起使用，进而指定条件起作用的范围。
 * 注解@Conditional接收Condition数组作为参数，Condition即我们的特定条件。Condition只有一个方法matches，当符合条件时，返回true；当不符合条件时，返回false。
 *
 * @author mzk
 */
public class OnWindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String osName = context.getEnvironment().getProperty("os.name");
        if (osName.indexOf("win") >= 0)
            return true;
        else {
            return false;
        }
    }
}