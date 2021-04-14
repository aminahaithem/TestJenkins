package com.sip.testJenkins.configuration;

import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.MeterRegistry;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

//import io.micrometer.core.instrument.MeterRegistry;
//import io.micrometer.spring.autoconfigure.MeterRegistryCustomizer;

@Configuration
public class MicrometerConfiguration {

    @Bean
	MeterRegistryCustomizer<MeterRegistry> meterRegistryCustomizer(MeterRegistry meterRegistry)
	{
		return meterRegistry1->{
			meterRegistry.config()
			.commonTags("testjenkins","articles-exemple");
			
		};
	}
}
