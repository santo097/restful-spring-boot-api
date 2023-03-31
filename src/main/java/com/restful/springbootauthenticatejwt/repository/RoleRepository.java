package com.restful.springbootauthenticatejwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restful.springbootauthenticatejwt.models.Role;
import com.restful.springbootauthenticatejwt.models.ERole;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(ERole name);
}
