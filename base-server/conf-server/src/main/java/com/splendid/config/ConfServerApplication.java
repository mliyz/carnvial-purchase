package com.splendid.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * spring config server
 *
 * @author liyuzhang
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfServerApplication {
	// FIXME  encrypt配置文件
	public static void main(String[] args) {
		SpringApplication.run(ConfServerApplication.class, args);
	}
}
