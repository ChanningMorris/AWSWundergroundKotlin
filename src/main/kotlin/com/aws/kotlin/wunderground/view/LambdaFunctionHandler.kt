package com.aws.kotlin.wunderground.view

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.aws.kotlin.wunderground.model.api.GetWeatherInput
import com.aws.kotlin.wunderground.model.api.GetWeatherOutput
import com.aws.kotlin.wunderground.model.adapter.callWunderground

class LambdaFunctionHandler : RequestHandler<GetWeatherInput, GetWeatherOutput> {
	override fun handleRequest(input: GetWeatherInput, context: Context) : GetWeatherOutput? {
		if(input.zipcode == null)
			throw IllegalArgumentException("Zipcode is null")
		context.getLogger().log("Input: " + input.zipcode)
		
		return callWunderground(input.zipcode)
	}
}