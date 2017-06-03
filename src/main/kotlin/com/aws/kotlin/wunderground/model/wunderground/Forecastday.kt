package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Forecastday {
	@SerializedName("period")
	@Expose
	var period: kotlin.Int? = null
	@SerializedName("icon")
	@Expose
	var icon: String? = null
	@SerializedName("icon_url")
	@Expose
	var iconUrl: String? = null
	@SerializedName("title")
	@Expose
	var title: String? = null
	@SerializedName("fcttext")
	@Expose
	var fcttext: String? = null
	@SerializedName("fcttext_metric")
	@Expose
	var fcttextMetric: String? = null
	@SerializedName("pop")
	@Expose
	var pop: String? = null
}