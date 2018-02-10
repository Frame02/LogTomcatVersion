package com.srikar.spring.microservices;

import org.apache.catalina.startup.Tomcat;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by vedantas on 2/10/2018.
 */
@Configuration
@ConditionalOnClass(Tomcat.class)
@ConditionalOnProperty(name = "log-tomcat-version", matchIfMissing = true)
public class LogTomcatVersionAutoConfiguration {
    private static final Log logger = LogFactory.getLog(LogTomcatVersionAutoConfiguration.class);

    @PostConstruct
    public void logTomcatVersion(){
        logger.info("\n\nTomcat v" + Tomcat.class.getPackage().getImplementationVersion() + "\n");
    }
}
