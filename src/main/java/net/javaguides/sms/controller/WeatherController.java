package net.javaguides.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.sms.entity.Weather;
import net.javaguides.sms.service.WeatherService;

@Controller
public class WeatherController {
	
	private WeatherService weatherService;

	public WeatherController(WeatherService weatherService) {
		super();
		this.weatherService = weatherService;
	}
	
	// handler method to handle list weathers and return mode and view
	@GetMapping("/weathers")
	public String listWeathers(Model model) {
		model.addAttribute("weathers", weatherService.getAllWeathers());
		return "weathers";
	}
	
	@GetMapping("/weathers/new")
	public String createWeatherForm(Model model) {
		
		// create weather object to hold weather form data
		Weather weather = new Weather();
		model.addAttribute("weather", weather);
		return "create_weather";
		
	}
	
	@PostMapping("/weathers")
	public String saveWeather(@ModelAttribute("weather") Weather weather) {
		weatherService.saveWeather(weather);
		return "redirect:/weathers";
	}
	
	@GetMapping("/weathers/edit/{id}")
	public String editWeatherForm(@PathVariable Long id, Model model) {
		model.addAttribute("weather", weatherService.getWeatherById(id));
		return "edit_weather";
	}

	@PostMapping("/weathers/{id}")
	public String updateWeather(@PathVariable Long id,
			@ModelAttribute("weather") Weather weather,
			Model model) {
		
		// get weather from database by id
		Weather existingWeather = weatherService.getWeatherById(id);
		existingWeather.setId(id);
		existingWeather.setFirstName(weather.getFirstName());
		existingWeather.setLastName(weather.getLastName());
		existingWeather.setEmail(weather.getEmail());
		
		// save updated weather object
		weatherService.updateWeather(existingWeather);
		return "redirect:/weathers";		
	}
	
	// handler method to handle delete weather request
	
	@GetMapping("/weathers/{id}")
	public String deleteWeather(@PathVariable Long id) {
		weatherService.deleteWeatherById(id);
		return "redirect:/weathers";
	}
	
}
