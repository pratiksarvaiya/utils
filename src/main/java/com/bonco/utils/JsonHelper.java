package com.bonco.utils;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonHelper {
	private static Gson gson = GsonHelper.getGsonInstance();
	
	public static String toJson(Object o)
	{
		return gson.toJson(o);
	}
	
	public static <T> T fromJson(String json, Class<T> clazz)
	{
		return gson.fromJson(json, clazz);
	}
	
	public static String getResourceContents(String fileName)
	{
		//Path p = FileSystems.getDefault().getPath("C:/Attendance/", fileName);
		Path p = FileSystems.getDefault().getPath("/Users/pratiksarvaiya/Documents/AttendanceApi/Config", fileName);
		String retVal = null;
		try {
			retVal = new String(Files.readAllBytes(p));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retVal;
	}
	
	public static <T> T getObjectFromResource(String fileName, Class<T> clazz)
	{
		String s = getResourceContents(fileName);
		return fromJson(s, clazz);
	}

}
