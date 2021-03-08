package com.kosta.day15.Stream.sec04.stream_filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Aaa", "B", "Aaa", "D", "Abb");
		
		names.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
			.filter(n -> n.startsWith("A"))
			.forEach(n -> System.out.println(n));
		System.out.println();

		names.stream()
			.distinct()
			.filter(n -> n.startsWith("B"))
			.forEach(n -> System.out.println(n));		
	}
}
