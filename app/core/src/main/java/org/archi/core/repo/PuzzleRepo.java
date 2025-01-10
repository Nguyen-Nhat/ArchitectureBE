package org.archi.core.repo;

import org.archi.core.entity.Puzzle;
import org.archi.core.entity.PuzzleStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PuzzleRepo extends JpaRepository<Puzzle, Long> {
  List<Puzzle> findAllByStatus(PuzzleStatus status);
  Optional<Puzzle> findById(Long id);
  Page<Puzzle> findAll(Specification<Puzzle> spec, Pageable pageable);
}
