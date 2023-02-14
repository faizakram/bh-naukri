package com.bullhorn.repositories;

import com.bullhorn.DTO.AutoSuggestionResponseDto;
import com.bullhorn.entity.NaukriApplicationIndustryMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by richa on 31/3/17.
 */
@Repository
public interface NaukriApplicationIndustryMappingRepository extends JpaRepository<NaukriApplicationIndustryMappingEntity, Integer> {

    @Query("SELECT new com.bullhorn.DTO.AutoSuggestionResponseDto(e.naukriApplicationIndustryName,e.bhMasterIndustryId) FROM NaukriApplicationIndustryMappingEntity e where e.bhMasterIndustryId != 0")
    List<AutoSuggestionResponseDto> getNaukriBhApplicationMapping();

}
