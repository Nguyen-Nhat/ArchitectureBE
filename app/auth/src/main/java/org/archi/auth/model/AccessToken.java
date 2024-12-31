package org.archi.auth.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "access_tokens")
public class AccessToken {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String token;
  private Boolean revoked;
  private Boolean expired;

  @OneToOne
  @JoinColumn(name = "account_id", referencedColumnName = "id")
  private Account account;
}
