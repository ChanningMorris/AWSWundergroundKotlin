package com.aws.kotlin.wunderground.model.wunderground

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Forecastday_ {
	@SerializedName("date")
	@Expose
	var date: Date? = null
	@SerializedName("period")
	@Expose
	var period: kotlin.Int? = null
	@SerializedName("high")
	@Expose
	var high: High? = null
	@SerializedName("low")
	@Expose
	var low: Low? = null
	@SerializedName("conditions")
	@Expose
	var conditions: String? = null
	@SerializedName("icon")
	@Expose
	var icon: String? = null
	@SerializedName("icon_url")
	@Expose
	var iconUrl: String? = null
	@SerializedName("skyicon")
	@Expose
	var skyicon: String? = null
	@SerializedName("pop")
	@Expose
	var pop: kotlin.Int? = null
	@SerializedName("qpf_allday")
	@Expose
	var qpfAllday: QpfAllday? = null
	@SerializedName("qpf_day")
	@Expose
	var qpfDay: QpfDay? = null
	@SerializedName("qpf_night")
	@Expose
	var qpfNight: QpfNight? = null
	@SerializedName("snow_allday")
	@Expose
	var snowAllday: SnowAllday? = null
	@SerializedName("snow_day")
	@Expose
	var snowDay: SnowDay? = null
	@SerializedName("snow_night")
	@Expose
	var snowNight: SnowNight? = null
	@SerializedName("maxwind")
	@Expose
	var maxwind: Maxwind? = null
	@SerializedName("avewind")
	@Expose
	var avewind: Avewind? = null
	@SerializedName("avehumidity")
	@Expose
	var avehumidity: kotlin.Int? = null
	@SerializedName("maxhumidity")
	@Expose
	var maxhumidity: kotlin.Int? = null
	@SerializedName("minhumidity")
	@Expose
	var minhumidity: kotlin.Int? = null
}