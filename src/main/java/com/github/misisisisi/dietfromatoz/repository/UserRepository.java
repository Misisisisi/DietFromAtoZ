package com.github.misisisisi.dietfromatoz.repository;

import com.github.misisisisi.dietfromatoz.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByFirstNameAndLastName (String firstName, String lastName);

    Optional<UserEntity> findByUsernameIgnoreCase(String username);

    Optional<UserEntity> findById(Long id);

    UserEntity findUserByUsername(String username);

    UserEntity findUserByEmail(String email);
}
