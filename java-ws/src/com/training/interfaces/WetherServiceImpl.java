package com.training.interfaces;

import javax.jws.*;
@WebService(endpointInterface="com.training.interfaces.WeatherService")
public class WetherServiceImpl implements WeatherService {

@Override
public String getWeather(String city) 
{
	String currentWeather="29C -HAZE";
	if(city.equals("CHN")) {
		currentWeather="32C -SUNNY";
	}
	return currentWeather;

}
}


