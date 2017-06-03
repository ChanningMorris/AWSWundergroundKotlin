package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class TxtForecast {
	@SerializedName("date")
	@Expose
	var date: String? = null
	@SerializedName("forecastday")
	@Expose
	var forecastday: List<Forecastday>? = null
}