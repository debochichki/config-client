package com.example.configclient.web;

import com.example.configclient.CloudConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CurrenciesController {

  private final CloudConfig cloudConfig;

  public CurrenciesController(final CloudConfig cloudConfig) {
    this.cloudConfig = cloudConfig;
  }

  @GetMapping("/currencies")
  public List<String> getCurrencies() {
    return cloudConfig.getCurrencies();
  }
}
