package com.aws.kotlin.wunderground.model.adapter

import java.net.URLConnection
import java.net.URL
import java.net.InetSocketAddress
import java.io.InputStream
import java.io.InputStreamReader
import com.aws.kotlin.wunderground.model.wunderground.WundergroundForecastOutput
import com.aws.kotlin.wunderground.model.api.GetWeatherOutput
import com.aws.kotlin.wunderground.controller.MapperClass
import com.aws.kotlin.wunderground.controller.parseWundergroundResponse

fun callWunderground(zipCode: String?) : GetWeatherOutput? {
	var WundergroundKey: String? = System.getenv("WundergroundKey")
	var url: URL = URL("http://api.wunderground.com/api/" + WundergroundKey + "/forecast/q/" + zipCode + ".json")
	var connection: URLConnection = url.openConnection()
	
	var rawOutput: WundergroundForecastOutput = parseWundergroundResponse(InputStreamReader(connection.getInputStream()))
	return MapperClass.Companion.mapper.mapOutput(rawOutput)
}