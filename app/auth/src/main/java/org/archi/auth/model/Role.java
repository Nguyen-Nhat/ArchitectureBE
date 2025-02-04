package org.archi.auth.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.archi.auth.enums.ROLE;

@Entity
@Getter
@Setter
@Table(name = "roles")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Enumerated(EnumType.STRING)
  private ROLE name;
}
