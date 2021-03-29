package com.ms.profilejava.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("uat")
public class UatDatasourceConfig implements DatasourceConfig {
    @Override
    public void setup() {
        System.out.println("Setting up datasource for UAT environment. ");
    }

    @Override
    public String verifyOtp() {
        return null;
    }
}