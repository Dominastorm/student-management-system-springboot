package net.javaguides.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.sms.entity.Weather;
import net.javaguides.sms.repository.WeatherRepository;

@SpringBootApplication
public class WeatherWebsiteApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(WeatherWebsiteApplication.class, args);
	}

	@Autowired
	private WeatherRepository weatherRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
