package com.camon.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
@Import(CommonConfig.class)
@Slf4j
public class DevConfig {

    static {
        log.info("### DevConfig");
    }




}
