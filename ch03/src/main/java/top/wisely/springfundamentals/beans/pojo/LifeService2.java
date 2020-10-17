package top.wisely.springfundamentals.beans.pojo;

/**
 * Java配置：使用@Bean的initMethod和destroyMethod。
 * @author mzk
 */
public class LifeService2 {
    public LifeService2() {
        System.out.println("LifeService2:正在构造");
    }

    public void exeAfterConstruct() {
        System.out.println("LifeService2:在构造完成后执行");
    }

    public void exeBeforeDestroy() {
        System.out.println("LifeService2:在销毁之前执行");
    }
}