package com.bootcamp.rms.repo;

import com.bootcamp.rms.domain.Grade;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Kholishul_A on 28/04/2017.
 */
@Repository
public interface GradeRepository extends PagingAndSortingRepository<Grade, String> {
    List<Grade> findByEmployeeId(@Param("employeeId")String employeeId);
}
