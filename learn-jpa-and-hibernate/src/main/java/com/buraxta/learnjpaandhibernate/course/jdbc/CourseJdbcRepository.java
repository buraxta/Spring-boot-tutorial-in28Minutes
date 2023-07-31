package com.buraxta.learnjpaandhibernate.course.jdbc;

import com.buraxta.learnjpaandhibernate.course.Course;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY =
            """
                    insert into course (id, name, author)
                    values (?, ?, ?);
                    """;
    public void insert(Course course){
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

}
