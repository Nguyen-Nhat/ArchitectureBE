package org.archi.core.entity.game;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "game_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private int id;

    @Column(name = "type_name", nullable = false, length = 50)
    private String name;

    @Column(name = "is_realtime", nullable = false)
    private Boolean isRealtime = false;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "instruction")
    private String instruction;
}
