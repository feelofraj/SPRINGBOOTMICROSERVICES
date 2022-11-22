package org.raj.user.userservice.repository;

import org.raj.user.userservice.DTO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
