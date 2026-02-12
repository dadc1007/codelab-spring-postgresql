package org.adaschool.datapostgres.data.repository;

import org.adaschool.datapostgres.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
