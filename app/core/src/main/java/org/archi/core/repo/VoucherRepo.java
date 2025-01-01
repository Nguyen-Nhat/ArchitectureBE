package org.archi.core.repo;

import org.archi.core.entity.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoucherRepo extends JpaRepository<Voucher, Long> {
}
