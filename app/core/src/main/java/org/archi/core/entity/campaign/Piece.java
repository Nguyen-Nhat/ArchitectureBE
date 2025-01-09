package org.archi.core.entity.campaign;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "piece")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Piece implements Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "piece_id")
    private Long id;

    @Column(name = "image_url")
    private String imageUrl;
}
