package com.aws.kotlin.wunderground.controller

import com.aws.kotlin.wunderground.model.wunderground.WundergroundForecastOutput
import com.aws.kotlin.wunderground.model.api.GetWeatherOutput
import com.aws.kotlin.wunderground.model.api.Forecast
import com.aws.kotlin.wunderground.model.wunderground.Forecastday

fun mapOutput(forecast: WundergroundForecastOutput) : GetWeatherOutput {
	var output: GetWeatherOutput = GetWeatherOutput()
	var forecastArray: MutableList<Forecast>? = mutableListOf()
	
	for(item in forecast.forecast!!.txtForecast!!.forecastday!!){
		var forecastObj: Forecast = Forecast()
		forecastObj.condition = item.fcttext
		forecastObj.conditionMetric = item.fcttextMetric
		forecastObj.time = item.title
		forecastArray!!.add(forecastObj)
	}
	
	output.forecast = forecastArray
	return output
}