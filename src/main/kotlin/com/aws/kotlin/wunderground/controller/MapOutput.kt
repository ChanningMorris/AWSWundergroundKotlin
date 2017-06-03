package com.aws.kotlin.wunderground.controller

import com.aws.kotlin.wunderground.model.wunderground.WundergroundForecastOutput
import com.aws.kotlin.wunderground.model.api.GetWeatherOutput
import com.aws.kotlin.wunderground.model.wunderground.Forecastday
import com.aws.kotlin.wunderground.model.api.ForecastList
import com.aws.kotlin.wunderground.model.wunderground.TxtForecast
import com.aws.kotlin.wunderground.model.wunderground.Forecast

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
			Mapping(target = "condition", source = "fcttext"),
			Mapping(target = "conditionMetric", source = "fcttextMetric"),
			Mapping(target = "time", source = "title"))
	fun mapOutput(forecastDay: Forecastday?) : ForecastList?
	
	@Mapping(target = "forecast", source = "forecast.txtForecast.forecastday")
	fun mapOutput(outputObj: WundergroundForecastOutput?) : GetWeatherOutput?

}

