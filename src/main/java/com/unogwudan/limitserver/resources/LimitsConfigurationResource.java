package com.unogwudan.limitserver.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unogwudan.limitserver.models.Configuration;
import com.unogwudan.limitserver.models.LimitConfiguration;

@RestController
@EnableDiscoveryClient
public class LimitsConfigurationResource {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("limits")
	public LimitConfiguration getLimitConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
