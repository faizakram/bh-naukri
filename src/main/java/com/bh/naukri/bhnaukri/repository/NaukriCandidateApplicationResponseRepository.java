package com.bullhorn.repositories;

import com.bullhorn.entity.NaukriCandidateApplicationResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by richa on 6/2/17.
 */
@Repository
public interface NaukriCandidateApplicationResponseRepository extends JpaRepository<NaukriCandidateApplicationResponseEntity, Integer> {



}
