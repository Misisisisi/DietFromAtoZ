package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.PersonDataEntity;
import com.github.misisisisi.dietfromatoz.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonRepository extends JpaRepository<PersonDataEntity, Long> {

    List<PersonDataEntity> findAllByUser_username(String username);

    @Query("SELECT personData FROM PersonDataEntity personData WHERE personData.user.username = :username")
    PersonDataEntity findPersonDataEntityByUserName(String username);


}
