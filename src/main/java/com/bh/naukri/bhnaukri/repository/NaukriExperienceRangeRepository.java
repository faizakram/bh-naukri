package com.bullhorn.repositories;

import com.bullhorn.entity.NaukriExperienceRangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by richa on 28/9/16.
 */
@Repository
public interface NaukriExperienceRangeRepository extends JpaRepository<NaukriExperienceRangeEntity, Integer> {

    @Query("select NERE from NaukriExperienceRangeEntity NERE where NERE.naukriMinimumExperience = ?1")
    NaukriExperienceRangeEntity getNaukriExperienceRange(Integer bhExperience);

}
