package com.learner.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{

	public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Student student = new Student();
		student.setId(resultSet.getInt("id"));
		student.setAge(resultSet.getInt("age"));
		student.setName(resultSet.getString("name"));
		return student;
	}

}
