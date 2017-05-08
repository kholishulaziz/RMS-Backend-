package com.bootcamp.rms.repo;

import com.bootcamp.rms.domain.History;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Kholishul_A on 20/04/2017.
 */
@Repository
public interface HistoryRepository extends PagingAndSortingRepository<History, String> {
    List<History> findByEmployeeId(@Param("employeeId")String employeeId);
}
