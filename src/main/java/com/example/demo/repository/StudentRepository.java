package com.example.demo.repository;

import com.example.demo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Class description.
 * <p>
 * Created by matyushin-ka on 08.08.2019.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{

}
