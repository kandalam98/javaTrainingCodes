package com.training;

import javax.xml.ws.Endpoint;

import com.training.interfaces.WetherServiceImpl;
public class Application {
public static void main(String[] args) 
{
// TODO Auto-generated method stub
Endpoint ep=Endpoint.publish("http://localhost:5050/weather", new WetherServiceImpl());
System.out.println("Service published");
}

}