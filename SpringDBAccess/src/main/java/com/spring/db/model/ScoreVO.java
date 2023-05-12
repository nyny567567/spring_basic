package com.spring.db.model;
/*
CREATE TABLE scores(
		stu_id INT prIMAry KEY AUTO_INCREMENT,
		stu_nAme VARCHAR(30) NOT NULL,
	    KOR INT DEFAULT 0,
	    ENG INT DEFAULT 0,
	    math INT DEFAULT 0,
	    total INT DEFAULT 0,
	    averAGE DECIMAL(5, 2)
	  );
*/

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class ScoreVO {

	private int stuId;
	private String stuName;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double average;
	
	//총점, 평균을 구하는 메서드
	public void calcData() {
		this.total = this.kor + this.eng + this.math;
		this.average = Math.round((this.total/3.0) * 100) / 100.0;
	}
}
