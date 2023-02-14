package com.bullhorn.repositories;

import com.bullhorn.DTO.AutoSuggestResponseDto;
import com.bullhorn.entity.NaukriSalaryRangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by richa on 28/9/16.
 */
@Repository
public interface NaukriSalaryRangeRepository extends JpaRepository<NaukriSalaryRangeEntity, Integer> {

    @Query("SELECT new com.bullhorn.DTO.AutoSuggestResponseDto(NSRE.minimumSalary, NSRE.maximumSalary) FROM NaukriSalaryRangeEntity NSRE")
    List<AutoSuggestResponseDto> getNaukriSalaryList();

    @Query("SELECT NSRE FROM NaukriSalaryRangeEntity NSRE WHERE (NSRE.maximumSalary - ?1) >= 0")
    List<NaukriSalaryRangeEntity> getClosestMaximumSalary(Integer maximumSalary);

}
