package com.codingshuttle.working.internalWorkingOfSpringBoot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {

        SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}

    private RazorpayPaymentService paymentService = new RazorpayPaymentService();

    @Override
    public void run(String... args) throws Exception {
       String payment = paymentService.pay();
       System.out.println("Payment done :"+payment);
    }
}
