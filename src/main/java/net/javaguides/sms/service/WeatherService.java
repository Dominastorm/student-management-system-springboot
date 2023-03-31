package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Weather;

public interface WeatherService {
	List<Weather> getAllWeathers();
	
	Weather saveWeather(Weather weather);
	
	Weather getWeatherById(Long id);
	
	Weather updateWeather(Weather weather);
	
	void deleteWeatherById(Long id);
}
