package com.bonco.utils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonHelper {

	private static GsonBuilder gsonBuilder = new GsonBuilder().disableHtmlEscaping()
			.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
	        .serializeNulls();
	
	public static Gson getGsonInstance() {
		return  gsonBuilder.create();
	}
}
