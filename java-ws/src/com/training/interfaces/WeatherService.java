package com.training.interfaces;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
@WebService
@SOAPBinding(style = Style.RPC)
public interface WeatherService {
	@WebResult(name = "presentcondition")
public String getWeather(@WebParam(name="city") String city);



}