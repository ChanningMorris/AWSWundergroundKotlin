package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Response {
	@SerializedName("version")
	@Expose
	var version: String? = null
	@SerializedName("termsofService")
	@Expose
	var termsofService: String? = null
	@SerializedName("features")
	@Expose
	var features: Features? = null
}