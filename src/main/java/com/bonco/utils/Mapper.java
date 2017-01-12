package com.bonco.utils;

import org.modelmapper.ModelMapper;

public class Mapper {
	public static ModelMapper mapper = new ModelMapper();
	public static  <Tin, Tout> Tout map(Tin obj, Class<Tout> outputType)
	{
		return mapper.map(obj, outputType);
	}
	
}
