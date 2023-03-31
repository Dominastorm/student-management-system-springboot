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
	private String temperature;
	
	@Column(name = "humidity")
	private String humidity;
	
	public Weather() {
		
	}
	
	public Weather(String city, String temperature, String humidity) {
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
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
}
