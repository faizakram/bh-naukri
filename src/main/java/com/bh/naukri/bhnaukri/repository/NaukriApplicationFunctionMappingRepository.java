package com.bullhorn.repositories;

import com.bullhorn.DTO.AutoSuggestionResponseDto;
import com.bullhorn.entity.NaukriApplicationFunctionMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by richa on 31/3/17.
 */
@Repository
public interface NaukriApplicationFunctionMappingRepository extends JpaRepository<NaukriApplicationFunctionMappingEntity, Integer> {

    @Query("SELECT new com.bullhorn.DTO.AutoSuggestionResponseDto(e.naukriApplicationFunctionName,e.bhMasterFunctionId) FROM NaukriApplicationFunctionMappingEntity e where e.bhMasterFunctionId != 0")
    List<AutoSuggestionResponseDto> getNaukriBhApplicationMapping();

}
