package com.bullhorn.repositories;

import com.bullhorn.entity.BhClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BhClientRepository extends JpaRepository<BhClientEntity, Integer>{

    @Query("select BE.emailid from BhClientEntity BE where BE.bhId = ?1")
    String getEmailId(Integer bhClientId);

}
