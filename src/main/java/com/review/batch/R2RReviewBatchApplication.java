package com.review.batch;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class R2RReviewBatchApplication {
	
	private static final Logger Log = LogManager.getLogger(R2RReviewBatchApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(R2RReviewBatchApplication.class, args);
		Log.info("Review Batch Started Successfully::");
	}

}
