package net.javaguides.sms.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Weather {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "temperature")
	private int temperature;
	
	@Column(name = "humidity")
	private int humidity;
	
	public Weather() {
		
	}
	
	public Weather(String city, int temperature, int humidity) {
		super();
		this.city = city;
		this.temperature = temperature;
		this.humidity = humidity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
}
