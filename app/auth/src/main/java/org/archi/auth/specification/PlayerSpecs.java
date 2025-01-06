package org.archi.auth.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.*;
import org.archi.auth.model.Player;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Root;

import java.util.Locale;

public class PlayerSpecs {
  public static Specification<Player> containsName(String name) {
    return new Specification<Player>() {
      @Override
      public Predicate toPredicate(Root<Player> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase(Locale.ROOT) + "%");
      }
    };
  }
}