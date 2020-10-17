package top.wisely.springfundamentals.beans.annotated;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.*;
import org.springframework.stereotype.Component;
import top.wisely.springfundamentals.event.MessageEvent;

//@Component
public class EventListenerService2 {

    @EventListener
    public void eventListener(MessageEvent event){
        System.out.println("@EventListener接受到了：" + event.getMessage());
    }

    /**
     * 除能监听自定义发布的事件外，还可以监听系统发布的事件，示例如下。
     */
    @EventListener
    public void contextRefreshedEventListener(ContextRefreshedEvent event){
        System.out.println("@EventListener接受到了：" + event.getSource());
    }

    @EventListener
    public void contextStartedEventListener(ContextStartedEvent event){
        System.out.println("@EventListener接受到了：" + event.getSource());
    }

    @EventListener
    public void contextStoppedEventListener(ContextStoppedEvent event){
        System.out.println("@EventListener接受到了：" + event.getSource());
    }

    @EventListener
    public void contextClosedEventListener(ContextClosedEvent event){
        System.out.println("@EventListener接受到了：" + event.getSource());
    }

}
