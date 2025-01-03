package org.archi.auth.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "accounts")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String username;
  private String password;
  private String email;
  private String phoneNumber;

  @OneToOne(cascade = CascadeType.PERSIST, targetEntity = Role.class)
  @JoinColumn(name = "role_id")
  private Role role;

  @Column(name = "is_active")
  private Boolean isActive;
}
