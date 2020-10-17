package top.wisely.springfundamentals.injected;

import org.springframework.stereotype.Service;
import top.wisely.springfundamentals.beans.annotated.ScopeService;
import top.wisely.springfundamentals.beans.annotated.ScopeService2;
import top.wisely.springfundamentals.beans.pojo.ScopeService3;

/**
 * @author mzk
 */
@Service
public class ScopeInjectService {
    private ScopeService scopeService;
    private ScopeService scopeService1;
    private ScopeService2 scopeService2;
    private ScopeService2 scopeService21;
    private ScopeService3 scopeService3;
    private ScopeService3 scopeService31;

    /**
     * 只有一个构造器，此处可以省略   @Autowired
     *
     * @param scopeService
     * @param scopeService1
     * @param scopeService2
     * @param scopeService21
     * @param scopeService3
     * @param scopeService31
     */
    public ScopeInjectService(ScopeService scopeService,
                              ScopeService scopeService1,
                              ScopeService2 scopeService2,
                              ScopeService2 scopeService21,
                              ScopeService3 scopeService3,
                              ScopeService3 scopeService31) {
        this.scopeService = scopeService;
        this.scopeService1 = scopeService1;
        this.scopeService2 = scopeService2;
        this.scopeService21 = scopeService21;
        this.scopeService3 = scopeService3;
        this.scopeService31 = scopeService31;
    }

    public void validateScope() {
        //容器内只有一个实例，所以相等
        System.out.println(scopeService.equals(scopeService1));
        //请求注入创建新的实例，不相等
        System.out.println(scopeService2.equals(scopeService21));
        //请求注入创建新的实例，不相等
        System.out.println(scopeService3.equals(scopeService31));
    }
}