package com.tpBD.Plateformedehakathon.repositories;

import com.tpBD.Plateformedehakathon.Entity.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDto,Long> {

}
