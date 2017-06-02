package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Simpleforecast {
	@SerializedName("forecastday")
	@Expose
	var forecastday: List<Forecastday_>? = null
}