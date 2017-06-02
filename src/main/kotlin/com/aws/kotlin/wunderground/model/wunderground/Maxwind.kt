package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Maxwind {
	@SerializedName("mph")
	@Expose
	var mph: kotlin.Int? = null
	@SerializedName("kph")
	@Expose
	var kph: kotlin.Int? = null
	@SerializedName("dir")
	@Expose
	var dir: String? = null
	@SerializedName("degrees")
	@Expose
	var degrees: kotlin.Int? = null
}