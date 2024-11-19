package com.cakebaker.backery.alice.AliceBackery;

import com.cakebaker.backery.alice.AliceBackery.cakeBackerImpl.CakeBakerImpl;
import com.cakebaker.backery.alice.AliceBackery.cakeBaker.CakeBaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceBackeryApplication implements CommandLineRunner {

	@Autowired
	CakeBakerImpl cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(AliceBackeryApplication.class, args);
	}


	public void run(String... args) throws Exception {

		cakeBaker.bakeCake();


	}
}
