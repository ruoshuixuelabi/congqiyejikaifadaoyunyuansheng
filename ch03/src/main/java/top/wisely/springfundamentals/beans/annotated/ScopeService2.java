package top.wisely.springfundamentals.beans.annotated;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 通过@Scope(BeanDefinition.SCOPE_PROTOTYPE)指定Scope为prototype：
 *
 * @author mzk
 */
@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ScopeService2 {
}