package org.archi.auth.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.*;
import org.archi.auth.model.Brand;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Root;

import java.util.Locale;

public class BrandSpecs {
  public static Specification<Brand> containsName(String name) {
    return new Specification<Brand>() {
      @Override
      public Predicate toPredicate(Root<Brand> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase(Locale.ROOT) + "%");
      }
    };
  }
}