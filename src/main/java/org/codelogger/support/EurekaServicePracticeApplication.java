package org.codelogger.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by defei on 8/23/17.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServicePracticeApplication {

    public static void main(String[] args) {

        new SpringApplicationBuilder(EurekaServicePracticeApplication.class).web(true).run(args);
    }

    private static final Logger logger = LoggerFactory.getLogger(EurekaServicePracticeApplication.class);
}
