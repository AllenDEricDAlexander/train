package top.atluofu.train.gateway;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: GatewayApplication
 * @description: TODO
 * @author: 有罗敷的马同学
 * @datetime: 2023Year-10Month-15Day-15:33
 * @Version: 1.0
 */
@SpringBootApplication
@Slf4j
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
        log.info("gateway is running");
    }
}
