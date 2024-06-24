package top.atluofu.train.batch;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @ClassName: BatchApplication
 * @description: Batch App
 * @author: 有罗敷的马同学
 * @datetime: 2024Year-06Month-21Day-9:43
 * @Version: 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("top.atluofu.train.batch.feign")
@MapperScan("top.atluofu.train.batch.mapper")
@ComponentScan("top.atluofu.train")
@Slf4j
public class BatchApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(BatchApplication.class);
        ConfigurableEnvironment environment = springApplication.run(args).getEnvironment();
        log.info("Member Application is running!");
        log.info("Address:\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }
}
