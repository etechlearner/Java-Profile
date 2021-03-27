package com.ms.profilejava.controller;

import com.ms.profilejava.config.DatasourceConfig;
import com.ms.profilejava.message.MessageService;
import com.ms.profilejava.message.MessageType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @Autowired
    private MessageService messageService;

    @Autowired
    private Environment env;

    @Autowired
    DatasourceConfig datasourceConfig;

    @Value("${application.version}")
    public String appVersion;

    @RequestMapping(value = { "/","" })
    public String index() {
        datasourceConfig.setup();
        return env.getProperty("welcome.message") + " " + appVersion + " " + messageService.get("Log Message Test",MessageType.LOG) ;
    }

}
