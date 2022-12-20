package com.microservice.rest.rest.web.service.repository;

import com.microservice.rest.rest.web.service.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
