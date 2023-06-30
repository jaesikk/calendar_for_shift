package com.example.communityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CommunityserviceApplication {

  public static void main(String[] args) {
    SpringApplication.run(CommunityserviceApplication.class, args);
  }

}
