package top.wisely.springfundamentals.beans.pojo;

/**
 * 可以通过@Profile注解指定当前的运行场景。@Profile可以和@Component、@Configuration、@Bean等一起使用，
 * 当然也分别限制了@Profile生效的Bean的分组。
 * 下面使用需要显示不同操作系统的列表命令（在Windows下为 dir，在Linux下为 ls）的Bean。
 *
 * @author mzk
 */
public class CommandService {
    private String listCommand;

    public CommandService(String listCommand) {
        this.listCommand = listCommand;
    }

    public void list() {
        System.out.println("当前系统下列表命令是：" + listCommand);
    }
}