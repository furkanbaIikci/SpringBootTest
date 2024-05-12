package com.example.springboottest.Repository;

import com.example.springboottest.Model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemoRepository extends JpaRepository<Demo, String> {

    @Query(nativeQuery = true, value = "SELECT * FROM TBL_DEMO WHERE val LIKE (%:val%)")
    List<Demo> findByValue(@Param("val") String value);

    List<Demo> findByValueLikeIgnoreCase( String value);
}
