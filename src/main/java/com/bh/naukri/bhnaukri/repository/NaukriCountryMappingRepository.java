package com.bullhorn.repositories;

import com.bullhorn.DTO.AutoSuggestResponseDto;
import com.bullhorn.entity.NaukriCountryMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by richa on 28/9/16.
 */
@Repository
public interface NaukriCountryMappingRepository extends JpaRepository<NaukriCountryMappingEntity, Integer> {

    @Query("select new com.bullhorn.DTO.AutoSuggestResponseDto(NCME.naukriCountryId, NCME.naukriCountryName) from NaukriCountryMappingEntity NCME")
    List<AutoSuggestResponseDto> getNaukriCountryList();

    @Query("select new com.bullhorn.DTO.AutoSuggestResponseDto(NCME.naukriCountryId, NCME.hhMasterCountryId) from NaukriCountryMappingEntity NCME")
    List<AutoSuggestResponseDto> getNaukriCountryMappingList();

}
