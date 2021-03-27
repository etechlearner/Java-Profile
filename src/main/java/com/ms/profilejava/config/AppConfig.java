package com.ms.profilejava.config;

import com.ms.profilejava.message.LogMessage;
import com.ms.profilejava.message.MessagesFactory;
import com.ms.profilejava.message.ResponseMessage;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"com.ms"})
public class AppConfig {
    @Bean
    public FactoryBean serviceLocatorFactoryBean() {
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(MessagesFactory.class);
        return factoryBean;
    }

    @Bean(name = "logMessage")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public LogMessage logMessage() {
        return new LogMessage();
    }

    @Bean(name = "responseMessage")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ResponseMessage responseMessage() {
        return new ResponseMessage();
    }
}