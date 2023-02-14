package com.bullhorn.repositories;

import com.bullhorn.DTO.AutoSuggestResponseDto;
import com.bullhorn.DTO.NaukriFunctionMappingDto;
import com.bullhorn.entity.NaukriFunctionMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by richa on 28/9/16.
 */
@Repository
public interface NaukriFunctionMappingRepository extends JpaRepository<NaukriFunctionMappingEntity, Integer> {

    @Query("select new com.bullhorn.DTO.NaukriFunctionMappingDto(NFME.naukriFunctionId, NFME.naukriFunctionName, NFME.hhMasterFunctionalAreaId) from NaukriFunctionMappingEntity NFME")
    List<NaukriFunctionMappingDto> getNaukriFunctionList();

    @Query("select new com.bullhorn.DTO.AutoSuggestResponseDto(NFME.hhMasterFunctionalAreaId, NFME.bhMasterFunctionId) from NaukriFunctionMappingEntity NFME")
    List<AutoSuggestResponseDto> getHhBhFunctionList();

    @Query("select new com.bullhorn.DTO.AutoSuggestResponseDto(NFME.naukriFunctionId, NFME.bhMasterFunctionId) from NaukriFunctionMappingEntity NFME")
    List<AutoSuggestResponseDto> getNaukriBhFunctionList();

}
