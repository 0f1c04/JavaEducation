package com.kosta.day15.Stream.sec03.stream_pipelines;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("C", Member.MALE, 30),
				new Member("A", Member.FEMALE, 20),
				new Member("D", Member.MALE, 45),
				new Member("B", Member.FEMALE, 27)
		);
		
		double ageAvg =   list.stream()
			.filter(m -> m.getSex()==Member.FEMALE)
			.mapToInt(Member :: getAge)
			.average()
			.getAsDouble();
		
		System.out.println("Age average: " + ageAvg);
	}
}


