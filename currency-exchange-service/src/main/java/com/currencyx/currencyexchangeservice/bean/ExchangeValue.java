package com.currencyx.currencyexchangeservice.bean;


import lombok.AllArgsConstructor;
import lombok.Value;

import java.math.BigDecimal;

@Value
@AllArgsConstructor
public class ExchangeValue {
    Long id;
    String to;
    String from;
    BigDecimal conversionRate;
}
