package com.currencyx.limitservice.bean;

import lombok.Value;

@Value
public class LimitConfiguration {
    int minimum;
    int maximum;
}
