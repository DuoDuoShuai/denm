package com.duo.kindergartenll;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@MapperScan("com.duo.kindergartenll.mapper")
public class KindergartenllApplication {
    private final static Logger logger = LoggerFactory.getLogger(KindergartenllApplication.class);

    public static void main(String[] args) {
        System.setProperty("druid.mysql.usePingMethod", "false");
        ConfigurableApplicationContext run = SpringApplication.run(KindergartenllApplication.class, args);
        Environment bean = run.getBean(Environment.class);
        String port = bean.getProperty("server.port");
        InetAddress addr;
        try {
            addr = InetAddress.getLocalHost();
            logger.info("\n" +
                    " :: 本地访问地址 : http://localhost:" + port + "\n" +
                    " :: 局域网访问地址 : http://"+ addr.getHostAddress() + ":" + port + "\n" +
                    " :: 数据监控地址 : http://"+ addr.getHostAddress() + ":" + port + "/druid\n" +
                    " :: 公网访问地址 : 暂无");
        } catch (UnknownHostException e) {
            System.err.println(e.getMessage());
        }
    }

}
