package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WetherServiceImplService service=new WetherServiceImplService();
		WeatherService proxy=service.getPort(WeatherService.class);
		System.out.println(proxy.getWeather("HYD"));
		

	}

}
