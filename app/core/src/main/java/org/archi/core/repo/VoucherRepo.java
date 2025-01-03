package org.archi.core.repo;

import org.archi.core.entity.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoucherRepo extends JpaRepository<Voucher, Long> {
    List<Voucher> findByPlayerId(Long playerId);
    List<Voucher> findByStatusContainingIgnoreCaseOrQRCodeContainingIgnoreCase(String status, String qrCode);
}
