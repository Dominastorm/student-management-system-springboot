package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.sms.entity.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Long>{

}
