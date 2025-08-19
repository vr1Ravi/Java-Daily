package com.example.springjdbc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.springjdbc.model.Student;

@Repository
public class StudentRepository {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    
    public void save(Student st){
        String sql = "insert into  student (rollno, name, marks) values (?, ?, ?)";
       int rows = jdbc.update(sql, st.getRollNo(), st.getName(), st.getMarks());
       System.err.println("Rows affected:" + rows);
    }

    public List<Student> findAll(){
        String fetchQuery = "select * from student";

         return jdbc.query(fetchQuery, (rs, rowNum) -> {
                Student s = new Student();
                s.setName(rs.getString("name"));
                s.setRollNo(rs.getInt("rollno"));
                s.setMarks(rs.getInt("marks"));

                return s;
        });
    }
}
