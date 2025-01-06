package org.archi.auth.service;

import lombok.AllArgsConstructor;
import org.archi.auth.model.Account;
import org.archi.auth.model.Brand;
import org.archi.auth.repo.BrandRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BrandService {
  private final BrandRepo brandRepo;
  public Brand save(Brand brand) {
    return brandRepo.save(brand);
  }

  public Brand findById(long id) {
    return brandRepo.findById(id).orElse(null);
  }

  public Brand findByAccount(Account account) {
    return brandRepo.findByAccount(account).orElse(null);
  }

  public void deleteBrandByAccount(Account account) {
    brandRepo.deleteBrandByAccount(account);
  }

  public Page<Brand> findAll(Specification<Brand> specs, Pageable pageable) {
    return brandRepo.findAll(specs, pageable);
  }
}
