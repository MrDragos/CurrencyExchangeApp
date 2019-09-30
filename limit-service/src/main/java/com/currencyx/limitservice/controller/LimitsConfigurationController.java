package com.currencyx.limitservice.controller;

import com.currencyx.limitservice.bean.LimitConfiguration;
import com.currencyx.limitservice.configuration.Configuration;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LimitsConfigurationController {

    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration getLimitsConfiguration() {
        return new LimitConfiguration(configuration.getMin(), configuration.getMax());
    }

}
