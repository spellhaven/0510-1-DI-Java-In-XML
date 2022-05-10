package com.spellhaven.spring0510_1;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// ApplicationCTX.xml을 자바 파일로 만들어 보자. 할 수 있다, 크킄.

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1() { // 주입되는 객체(Bean)의 이름은 리턴값인 student가 아니라, 메소드의 이름인 student1이다. 헥깔리지 마, ㅋ.
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("컴퓨터게임");
		hobbies.add("친구들이랑 쌉행동 하기");
		hobbies.add("자연 다큐멘터리 시청");
		hobbies.add("아이쇼핑");
		
		Student student = new Student("깜찍이", 23, hobbies);
		student.setHeight(165);
		student.setWeight(47);
		
		return student;
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("컴퓨터게임");
		hobbies.add("운동");
		hobbies.add("독서");
		hobbies.add("그림그리기");
		
		Student student = new Student("시간이 많았던 과거의 깜찍이", 22, hobbies);
		student.setHeight(165);
		student.setWeight(50);
		
		return student;
	}
	
}














