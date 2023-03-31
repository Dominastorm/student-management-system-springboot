package net.javaguides.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.sms.entity.Weather;
import net.javaguides.sms.repository.WeatherRepository;
import net.javaguides.sms.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService{

	private WeatherRepository weatherRepository;
	
	public WeatherServiceImpl(WeatherRepository weatherRepository) {
		super();
		this.weatherRepository = weatherRepository;
	}

	@Override
	public List<Weather> getAllWeathers() {
		return weatherRepository.findAll();
	}

	@Override
	public Weather saveWeather(Weather weather) {
		return weatherRepository.save(weather);
	}

	@Override
	public Weather getWeatherById(Long id) {
		return weatherRepository.findById(id).get();
	}

	@Override
	public Weather updateWeather(Weather weather) {
		return weatherRepository.save(weather);
	}

	@Override
	public void deleteWeatherById(Long id) {
		weatherRepository.deleteById(id);	
	}

}
