package org.archi.auth.model;

import jakarta.persistence.*;
import lombok.*;
import org.archi.auth.enums.GENDER;

import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "players")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
  private String avatar;
  private Date birthDate;

  @Enumerated(EnumType.STRING)
  private GENDER gender;
  private String facebook;

  @OneToOne
  @JoinColumn(name = "account_id", referencedColumnName = "id")
  private Account account;
}
