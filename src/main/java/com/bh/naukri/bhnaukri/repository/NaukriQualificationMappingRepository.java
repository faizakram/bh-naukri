package com.bullhorn.repositories;

import com.bullhorn.DTO.AutoSuggestResponseDto;
import com.bullhorn.entity.NaukriQualificationMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by richa on 17/2/17.
 */
@Repository
public interface NaukriQualificationMappingRepository extends JpaRepository<NaukriQualificationMappingEntity, Integer> {

    @Query("select new com.bullhorn.DTO.AutoSuggestResponseDto(NQME.id, NQME.naukriQualificationName) from NaukriQualificationMappingEntity NQME")
    List<AutoSuggestResponseDto> getAllQualification();

    @Query("select NQME from NaukriQualificationMappingEntity NQME where NQME.naukriQualificationName = ?1")
    NaukriQualificationMappingEntity getQualification(String naukriQualificationName);

}
