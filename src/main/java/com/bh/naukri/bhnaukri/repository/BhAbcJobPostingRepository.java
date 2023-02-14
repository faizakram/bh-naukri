package com.bh.naukri.bhnaukri.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bh.naukri.bhnaukri.model.BhAbcJobPostingEntity;

@Repository
public interface BhAbcJobPostingRepository extends JpaRepository<BhAbcJobPostingEntity, Integer> {

    @Query("SELECT e FROM BhAbcJobPostingEntity e WHERE e.bhJobId = ?1")
    BhAbcJobPostingEntity getJobByBhJobId(long bhJobId);

    @Query("SELECT e FROM BhAbcJobPostingEntity e WHERE e.bhJobId = ?1 AND e.status = 1 ")
    BhAbcJobPostingEntity getActiveJobByBhJobId(long bhJobId);

}
