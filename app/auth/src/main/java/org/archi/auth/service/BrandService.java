package org.archi.auth.service;

import lombok.AllArgsConstructor;
import org.archi.auth.model.Brand;
import org.archi.auth.repo.BrandRepo;
import org.springframework.stereotype.Service;

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
}
