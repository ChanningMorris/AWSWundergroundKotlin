package com.aws.kotlin.wunderground.model.api

class GetWeatherInput{
	var zipcode: String? = null
}

class GetWeatherOutput{
	var forecast: List<ForecastList>? = null
}

class ForecastList{
	var time: String? = null
	var condition: String? = null
	var conditionMetric: String? = null
}