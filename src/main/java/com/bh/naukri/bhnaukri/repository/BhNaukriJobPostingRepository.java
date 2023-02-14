package com.bullhorn.repositories;

import com.bullhorn.entity.BhNaukriJobPostingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by richa on 3/2/17.
 */
@Repository
public interface BhNaukriJobPostingRepository extends JpaRepository<BhNaukriJobPostingEntity, Integer> {

    @Query("select BNJPE.bhJobId from BhNaukriJobPostingEntity BNJPE where BNJPE.naukriJobId = ?1")
    Long getBhJobIdFromNaukriJobId(Long naukriJobId);

    @Query("select BNJPE from BhNaukriJobPostingEntity BNJPE where BNJPE.bhJobId = ?1")
    BhNaukriJobPostingEntity getFromBhJobId(Long bhJobId);

}
