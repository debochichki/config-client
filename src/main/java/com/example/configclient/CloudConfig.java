package com.example.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;

@ConstructorBinding
@ConfigurationProperties
public class CloudConfig {

  private final List<String> currencies;

  public CloudConfig(List<String> currencies) {
    this.currencies = currencies;
  }

  public List<String> getCurrencies() {
    return currencies;
  }
}
