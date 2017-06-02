package com.aws.kotlin.wunderground.controller

import com.aws.kotlin.wunderground.model.wunderground.WundergroundForecastOutput
import com.google.gson.Gson
import java.io.InputStreamReader

fun parseWundergroundResponse(json: InputStreamReader) : WundergroundForecastOutput{
	val gson: Gson = Gson()
	return gson.fromJson(json, WundergroundForecastOutput().javaClass) 
}