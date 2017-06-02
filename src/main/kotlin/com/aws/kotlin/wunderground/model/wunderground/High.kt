package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class High {
	@SerializedName("fahrenheit")
	@Expose
	var fahrenheit: String? = null
	@SerializedName("celsius")
	@Expose
	var celsius: String? = null
}