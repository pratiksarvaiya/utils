package com.bonco.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapUtil {
	
	public static <K extends Comparable<? super K>, V> Map<K, V> sortMapByKey(Map<K, V> map) {
		Map<K, V> sorted = new LinkedHashMap<>();
		
		map.entrySet().stream()
			.sorted(Map.Entry.<K, V>comparingByKey())
			.forEachOrdered(r-> sorted.put(r.getKey(), r.getValue()));
		
		return sorted;
	}
	
	public static <K, V extends Comparable<? super V>> Map<K, V> sortMapByValue(Map<K, V> map) {
		Map<K, V> sorted = new LinkedHashMap<>();
		
		map.entrySet().stream()
			.sorted(Map.Entry.<K, V>comparingByValue())
			.forEachOrdered(r-> sorted.put(r.getKey(), r.getValue()));
		
		return sorted;
	}

}
