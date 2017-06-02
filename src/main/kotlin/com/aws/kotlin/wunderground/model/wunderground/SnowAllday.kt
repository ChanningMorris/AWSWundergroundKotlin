package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SnowAllday {
	@SerializedName("in")
	@Expose
	var `in`: Double? = null
	@SerializedName("cm")
	@Expose
	var cm: Double? = null
}