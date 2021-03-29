package com.ms.profilejava.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import java.io.IOException;

@Configuration
public class FilterConfiguration {

    @Bean
    public Filter loggerFilter() {
        return new Filter() {
            private final Logger logger = LoggerFactory.getLogger(getClass());
            @Override
            public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                logger.info("LOGGED Filter Request Response ");
                chain.doFilter(request, response);
            }
        };
    }

}