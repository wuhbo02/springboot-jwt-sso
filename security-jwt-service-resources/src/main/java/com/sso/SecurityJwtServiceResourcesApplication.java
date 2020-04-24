package com.sso;

import com.sso.config.RsaKeyProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@MapperScan("com.sso.mapper")
@EnableConfigurationProperties(RsaKeyProperties.class)
public class SecurityJwtServiceResourcesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityJwtServiceResourcesApplication.class, args);
    }

}
