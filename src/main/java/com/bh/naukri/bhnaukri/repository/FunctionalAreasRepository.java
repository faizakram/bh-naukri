package com.bullhorn.repositories;

import com.bullhorn.DTO.AutoSuggestResponseDto;
import com.bullhorn.entity.FunctionalAreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FunctionalAreasRepository extends JpaRepository<FunctionalAreaEntity, Integer> {

	@Query("Select new com.bullhorn.DTO.AutoSuggestResponseDto(FAE.naukriFunctionId, FAE.id) from FunctionalAreaEntity FAE where FAE.isDeleted = 0")
	List<AutoSuggestResponseDto> getHhToNaukriMapping();

}
