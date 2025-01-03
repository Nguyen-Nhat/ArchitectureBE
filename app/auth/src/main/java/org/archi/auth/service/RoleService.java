package org.archi.auth.service;

import lombok.AllArgsConstructor;
import org.archi.auth.enums.ROLE;
import org.archi.auth.model.Role;
import org.archi.auth.repo.RoleRepo;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleService {
  private final RoleRepo roleRepo;

  public Role findByName(ROLE name) {
    return roleRepo.findByName(name).orElse(null);
  }
  public Role findByNameOrElseThrow(ROLE name) {
    return roleRepo.findByName(name).orElseThrow(() -> new RuntimeException("Role not found"));
  }
}
