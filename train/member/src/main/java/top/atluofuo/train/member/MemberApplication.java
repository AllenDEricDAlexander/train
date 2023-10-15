package top.atluofuo.train.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author 有罗敷的马同学
 * @description 12306 mini
 * @Date 11:51 2023-10-15
 * @Param void
 * @Version v1.0
 * @Return void
 **/
@SpringBootApplication
public class MemberApplication {

    private static final Logger log = LoggerFactory.getLogger(MemberApplication.class);

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(MemberApplication.class);
        ConfigurableEnvironment environment = springApplication.run(args).getEnvironment();
        log.info("Member Application is running!");
        log.info("Address:\thttp://127.0.0.1:{}", environment.getProperty("server.port"));
    }

}
