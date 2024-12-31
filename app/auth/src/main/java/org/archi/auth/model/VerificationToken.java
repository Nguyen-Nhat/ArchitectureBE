package org.archi.auth.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "verification_tokens")
public class VerificationToken {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String token;
  @Column(name = "expiry_date")
  private Date expiryDate;

  @OneToOne
  @JoinColumn(name = "account_id", referencedColumnName = "id")
  private Account account;
}
