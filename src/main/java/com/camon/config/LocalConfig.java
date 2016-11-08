package com.camon.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@Profile({"default", "local"})
@Import(CommonConfig.class)
@Slf4j
public class LocalConfig extends WebMvcConfigurerAdapter {

    static {
        log.info("### LocalConfig");
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations(staticResouceLocation);
//    }


}
