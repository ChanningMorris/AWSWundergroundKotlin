package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Date {
	@SerializedName("epoch")
	@Expose
	var epoch: String? = null
	@SerializedName("pretty")
	@Expose
	var pretty: String? = null
	@SerializedName("day")
	@Expose
	var day: kotlin.Int? = null
	@SerializedName("month")
	@Expose
	var month: kotlin.Int? = null
	@SerializedName("year")
	@Expose
	var year: kotlin.Int? = null
	@SerializedName("yday")
	@Expose
	var yday: kotlin.Int? = null
	@SerializedName("hour")
	@Expose
	var hour: kotlin.Int? = null
	@SerializedName("min")
	@Expose
	var min: String? = null
	@SerializedName("sec")
	@Expose
	var sec: kotlin.Int? = null
	@SerializedName("isdst")
	@Expose
	var isdst: String? = null
	@SerializedName("monthname")
	@Expose
	var monthname: String? = null
	@SerializedName("monthname_short")
	@Expose
	var monthnameShort: String? = null
	@SerializedName("weekday_short")
	@Expose
	var weekdayShort: String? = null
	@SerializedName("weekday")
	@Expose
	var weekday: String? = null
	@SerializedName("ampm")
	@Expose
	var ampm: String? = null
	@SerializedName("tz_short")
	@Expose
	var tzShort: String? = null
	@SerializedName("tz_long")
	@Expose
	var tzLong: String? = null
}