package com.aws.kotlin.wunderground.controller

import com.aws.kotlin.wunderground.model.wunderground.WundergroundForecastOutput
import com.aws.kotlin.wunderground.model.api.GetWeatherOutput

import org.mapstruct.Mapper
import org.mapstruct.factory.Mappers
import org.mapstruct.Mapping
import org.mapstruct.Mappings

@Mapper
interface MapperClass {

	companion object{
		val mapper = Mappers.getMapper( MapperClass::class.java )
	}
	@Mappings(
			Mapping(target = "forecastArray.condition", source = "forecast.txtForecast.forecastday.fcttext"),
			Mapping(target = "forecastArray.conditionMetric", source = "forecast.txtForecast.forecastday.fcttextMetric"),
			Mapping(target = "forecastArray.time", source = "forecast.txtForecast.forecastday.title")
	)
	fun mapOutput(forecast: WundergroundForecastOutput?) : GetWeatherOutput?
}