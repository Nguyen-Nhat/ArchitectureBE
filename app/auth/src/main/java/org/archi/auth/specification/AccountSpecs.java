package org.archi.auth.specification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.*;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Root;
import org.archi.auth.model.Account;

import java.util.Locale;

public class AccountSpecs {
  public static Specification<Account> containsUsername(String name) {
    return new Specification<Account>() {
      @Override
      public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return cb.like(cb.lower(root.get("username")), "%" + name.toLowerCase(Locale.ROOT) + "%");
      }
    };
  }
}