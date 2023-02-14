package com.bullhorn.repositories;

import com.bullhorn.entity.NaukriFunctionRoleMappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by richa on 16/2/17.
 */
@Repository
public interface NaukriFunctionRoleMappingRepository extends JpaRepository<NaukriFunctionRoleMappingEntity, Integer> {

    @Query("Select e from NaukriFunctionRoleMappingEntity e where e.naukriFunctionId = ?1 AND e.bhNaukriRoleName = ?2")
    List<NaukriFunctionRoleMappingEntity> getNaukriFunctionRoleMappingEntity(String naukriFunctionId, String bhNaukriRoleName);

}
