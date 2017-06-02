package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Features {
	@SerializedName("forecast")
	@Expose
	var forecast: kotlin.Int? = null
}