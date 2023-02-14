package com.bullhorn.repositories;

import com.bullhorn.DTO.AutoSuggestResponseDto;
import com.bullhorn.entity.IndustryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndustryRepository extends JpaRepository<IndustryEntity, Integer> {

	@Query("Select new com.bullhorn.DTO.AutoSuggestResponseDto(IE.id, IE.naukriIndustryId) from IndustryEntity IE where IE.isDeleted = 0")
	List<AutoSuggestResponseDto> getHhToNaukriMapping();

}
