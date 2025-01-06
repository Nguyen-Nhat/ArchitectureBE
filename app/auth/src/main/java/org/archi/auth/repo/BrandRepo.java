package org.archi.auth.repo;

import org.archi.auth.model.Account;
import org.archi.auth.model.Brand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface BrandRepo extends JpaRepository<Brand, Long> {
  Optional<Brand> findByAccount(Account account);

  @Transactional
  void deleteBrandByAccount(Account account);

  Page<Brand> findAll(Specification<Brand> specs, Pageable pageable);
}
