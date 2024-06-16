package top.atluofu.train.gateway;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @ClassName: GatewayApplication
 * @description: 启动类
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-15Day-15:33
 * @Version: 1.0
 */
@SpringBootApplication
@Slf4j
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(GatewayApplication.class);
        ConfigurableEnvironment environment = springApplication.run(args).getEnvironment();
        log.info("Gateway Application is running!");
        log.info("Address:\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }
}
