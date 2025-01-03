package org.archi.auth.repo;

import org.archi.auth.enums.ROLE;
import org.archi.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ROLE name);
}
