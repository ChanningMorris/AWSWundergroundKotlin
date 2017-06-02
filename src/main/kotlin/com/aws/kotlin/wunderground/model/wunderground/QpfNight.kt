package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class QpfNight {
	@SerializedName("in")
	@Expose
	var `in`: Double? = null
	@SerializedName("mm")
	@Expose
	var mm: kotlin.Int? = null
}