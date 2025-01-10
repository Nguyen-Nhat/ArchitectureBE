package org.archi.core.specifications;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.*;
import org.archi.common.auth.Brand;
import org.archi.core.entity.Puzzle;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Root;

import java.util.Locale;

public class PuzzleSpecs {
  public static Specification<Puzzle> containsTitle(String title) {
    return new Specification<Puzzle>() {
      @Override
      public Predicate toPredicate(Root<Puzzle> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return cb.like(cb.lower(root.get("title")), "%" + title.toLowerCase(Locale.ROOT) + "%");
      }
    };
  }
}