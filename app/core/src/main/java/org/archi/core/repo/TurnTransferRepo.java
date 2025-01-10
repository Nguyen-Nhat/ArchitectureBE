package org.archi.core.repo;

import org.archi.core.entity.TurnTransfer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnTransferRepo extends JpaRepository<TurnTransfer, Long> {
}
