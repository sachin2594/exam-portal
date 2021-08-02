package com.examserver.repository;

import com.examserver.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface RoleRepository extends JpaRepository<Role, Long> {


}
