package com.bullhorn.repositories;

import com.bullhorn.DTO.AutoSuggestResponseDto;
import com.bullhorn.entity.NaukriIndustryMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by richa on 28/9/16.
 */
@Repository
public interface NaukriIndustryMappingRepository extends JpaRepository<NaukriIndustryMappingEntity, Integer> {

    @Query("select new com.bullhorn.DTO.AutoSuggestResponseDto(NIME.naukriIndustryName, NIME.naukriIndustryId) from NaukriIndustryMappingEntity NIME")
    List<AutoSuggestResponseDto> getNaukriIndustryList();

    @Query("select new com.bullhorn.DTO.AutoSuggestResponseDto(NIME.hhMasterIndustryId, NIME.naukriIndustryId) from NaukriIndustryMappingEntity NIME")
    List<AutoSuggestResponseDto> getNaukriIndustryMappingList();

    @Query("select new com.bullhorn.DTO.AutoSuggestResponseDto(NIME.hhMasterIndustryId, NIME.bhMasterIndustryId) from NaukriIndustryMappingEntity NIME")
    List<AutoSuggestResponseDto> getHhBhIndustryMappingList();

    @Query("select new com.bullhorn.DTO.AutoSuggestResponseDto(NIME.naukriIndustryId, NIME.bhMasterIndustryId) from NaukriIndustryMappingEntity NIME")
    List<AutoSuggestResponseDto> getNaukriBhIndustryMappingList();

}
