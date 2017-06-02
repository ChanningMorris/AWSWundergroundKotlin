package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Forecast {
	@SerializedName("txt_forecast")
	@Expose
	var txtForecast: TxtForecast? = null
	@SerializedName("simpleforecast")
	@Expose
	var simpleforecast: Simpleforecast? = null
}