package top.wisely.springfundamentals.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import top.wisely.springfundamentals.beans.pojo.CommandService;

/**
 * 在Linux开发环境下，场景配置如下。
 *
 * @author mzk
 */
@Configuration
@Profile("production")
public class LinuxProfileConfig {
    @Bean
    CommandService commandService() {
        return new CommandService("ls");
    }
}