package com.example.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Manual refresh of configuration properties, served by the Config Server, works only if they are
 * registered as Spring Beans
 */
@ConfigurationProperties
@Component
public class CloudConfig {

  private final List<String> currencies;

  public CloudConfig(List<String> currencies) {
    this.currencies = currencies;
  }

  public List<String> getCurrencies() {
    return currencies;
  }
}
