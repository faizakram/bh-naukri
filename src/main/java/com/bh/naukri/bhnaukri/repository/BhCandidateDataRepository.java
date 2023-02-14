package com.bullhorn.repositories;

import com.bullhorn.DTO.BhCandidateDataDto;
import com.bullhorn.entity.BhCandidateDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by richa on 1/9/16.
 */
@Repository
public interface BhCandidateDataRepository extends JpaRepository<BhCandidateDataEntity, Integer> {

    @Query("select BCDE from BhCandidateDataEntity as BCDE where BCDE.bhCandidateId = ?1")
    List<BhCandidateDataEntity> getCandidateDataEntry(Integer candidateId);

    @Query("select BCDE from BhCandidateDataEntity as BCDE where BCDE.isDeleted = 2 AND BCDE.functionId IS NULL AND BCDE.industryId IS NULL AND id >= ?1")
    List<BhCandidateDataEntity> getCandidateDataEntryLongResumeWithGreaterId(Integer id);

    @Query("select BCDE from BhCandidateDataEntity as BCDE where BCDE.isDeleted = 2 AND BCDE.functionId IS NULL AND BCDE.industryId IS NULL")
    List<BhCandidateDataEntity> getCandidateDataEntryLongResume();

    @Query("select BCDE from BhCandidateDataEntity as BCDE where BCDE.functionId IS NULL AND BCDE.industryId IS NULL AND BCDE.isDeleted = 0")
    List<BhCandidateDataEntity> getAllCandidateDataEntry();

    @Query("select BCDE from BhCandidateDataEntity as BCDE where BCDE.functionId IS NULL AND BCDE.industryId IS NULL AND BCDE.isDeleted = 0 AND BCDE.id <= ?1")
    List<BhCandidateDataEntity> getAllCandidateDataEntryLessThanId(Integer id);

    @Query("select BCDE from BhCandidateDataEntity as BCDE where BCDE.functionId IS NULL AND BCDE.industryId IS NULL AND BCDE.isDeleted = 0 AND BCDE.id > ?1")
    List<BhCandidateDataEntity> getAllCandidateDataEntryGreaterThanId(Integer id);

    @Query("select BCDE from BhCandidateDataEntity as BCDE where BCDE.functionId IS NULL AND BCDE.industryId IS NULL AND BCDE.isDeleted = 0 AND BCDE.id >= ?1 AND BCDE.id <= ?2")
    List<BhCandidateDataEntity> getAllCandidateDataEntryBetweenId(Integer startId, Integer endId);

    @Query("select new com.bullhorn.DTO.BhCandidateDataDto(BCDE.bhCandidateId, BCDE.functionId, BCDE.industryId ) " +
            "from BhCandidateDataEntity as BCDE where BCDE.isDeleted = 1 and (BCDE.functionId IS NOT NULL OR BCDE" +
            ".industryId IS NOT NULL) ")
    List<BhCandidateDataDto> getAllCandidateDataEntryForUpdate();

    @Query("select new com.bullhorn.DTO.BhCandidateDataDto(BCDE.bhCandidateId, BCDE.functionId, BCDE.industryId) from BhCandidateDataEntity as BCDE where BCDE.isDeleted = 3 and BCDE.functionId IS NOT NULL and BCDE.industryId IS NOT NULL")
    List<BhCandidateDataDto> getAllCandidateDataEntryForUpdateByNaukri();

    @Query("select new com.bullhorn.DTO.BhCandidateDataDto(BCDE.bhCandidateId, BCDE.functionId, BCDE.industryId) from BhCandidateDataEntity as BCDE where BCDE.bhCandidateId = ?1 AND BCDE.isDeleted = 3 and BCDE.functionId IS NOT NULL and BCDE.industryId IS NOT NULL")
    List<BhCandidateDataDto> getCandidateDataEntryForUpdateByNaukri(Integer bhCandidateId);

    @Modifying
    @Query("UPDATE BhCandidateDataEntity BCDE SET BCDE.isDeleted = 3, BCDE.modified = ?2 where BCDE.bhCandidateId IN (?1)")
    void updateAllCandidateDataEntryForUpdate(List<Integer> candidateIds, Timestamp modifiedDate);

    @Query("select BCDE.id from BhCandidateDataEntity as BCDE where BCDE.isDeleted = 1")
    List<Integer> getParsedIds();

    @Query("select BCDE from BhCandidateDataEntity as BCDE where BCDE.bhCandidateId = ?1")
    List<BhCandidateDataEntity> getBhCandidate(Integer candidateId);


}
