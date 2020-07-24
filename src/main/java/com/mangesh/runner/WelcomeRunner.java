package com.mangesh.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WelcomeRunner implements CommandLineRunner{

	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("WELCOME SPRING BOOT APPLICATION..!!!!");
	}

}
