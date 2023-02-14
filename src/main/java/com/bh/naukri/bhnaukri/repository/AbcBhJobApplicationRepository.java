package com.bh.naukri.bhnaukri.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bh.naukri.bhnaukri.model.AbcBhJobApplicationEntity;



@Repository
public interface AbcBhJobApplicationRepository extends JpaRepository<AbcBhJobApplicationEntity, Integer> {

    @Query("select AbcBhApps from AbcBhJobApplicationEntity as AbcBhApps where AbcBhApps.status = 0")
    List<AbcBhJobApplicationEntity> getAllAbcBhApplications();

    @Query("select AbcBhApps from AbcBhJobApplicationEntity as AbcBhApps where AbcBhApps.email = ?1")
    AbcBhJobApplicationEntity getAbcApplicationByEmail(String email);

}
