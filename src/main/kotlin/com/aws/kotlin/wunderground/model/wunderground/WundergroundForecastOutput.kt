package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class WundergroundForecastOutput {
	@SerializedName("response")
	@Expose
	var response: Response? = null
	@SerializedName("forecast")
	@Expose
	var forecast: Forecast? = null
}