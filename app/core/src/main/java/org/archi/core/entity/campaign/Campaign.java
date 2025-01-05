//package org.archi.core.entity.campaign;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name = "campaign")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Campaign {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "campaign_id")
//    private Long id;
//
//    @Column(name = "campaign_name")
//    private String name;
//
//    @Column(name = "brand_id")
//    private Long brandId;
//}

package org.archi.core.entity.campaign;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "campaign")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String description;
    private String status;
    @Column(name = "brand_id", nullable = false)
    private Long brandId; // Reference to Brand in Auth Service
    @OneToOne(mappedBy = "campaign")
    private Payment payment;
}
