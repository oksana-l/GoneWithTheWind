package com.IntelliJ.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.IntelliJ.test1.service.Tableau2D.remainingLeaves;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {

		int width = 5;
		int height = 5;
		int [][] leaves = {
			{0, 0, 0, 0, 1},
			{0, 0, 0, 0, 1},
			{0, 0, 0, 0, 0},
			{0, 0, 1, 3, 0},
			{0, 0, 0, 2, 0}
		};
		String winds = "ULLL";
		int result = remainingLeaves(width, height, leaves, winds);
	
		System.out.println(result);
	}

}

