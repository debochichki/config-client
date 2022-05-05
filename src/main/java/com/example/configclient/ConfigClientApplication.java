package com.example.configclient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(CloudConfig.class)
public class ConfigClientApplication implements CommandLineRunner {

  private final CloudConfig cloudConfig;

  public ConfigClientApplication(CloudConfig cloudConfig) {
    this.cloudConfig = cloudConfig;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConfigClientApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(cloudConfig.getCurrencies());
  }
}

