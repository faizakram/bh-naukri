package com.bullhorn.repositories;

import com.bullhorn.DTO.AutoSuggestResponseDto;
import com.bullhorn.entity.NaukriCityMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by richa on 28/9/16.
 */
@Repository
public interface NaukriCityMappingRepository extends JpaRepository<NaukriCityMappingEntity, Integer> {

    @Query("select new com.bullhorn.DTO.AutoSuggestResponseDto(NCME.naukriCityId, NCME.naukriCityName) from NaukriCityMappingEntity NCME")
    List<AutoSuggestResponseDto> getNaukriCityList();

    @Query("select new com.bullhorn.DTO.AutoSuggestResponseDto(NCME.hhMasterCityId, NCME.naukriCityName) from NaukriCityMappingEntity NCME")
    List<AutoSuggestResponseDto> getNaukriMappingCityList();

}
