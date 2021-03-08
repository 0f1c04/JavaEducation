package com.kosta.day15.Stream.sec05.stream_mapping;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("A", 10),
				new Student("C", 20),
				new Student("B", 30)
		);
			
		studentList.stream()
			.mapToInt(Student :: getScore)
			.forEach(score -> System.out.println(score));

		studentList.stream()
				.map(Student :: getName)
				.forEach(name -> System.out.println(name));
	}
}
