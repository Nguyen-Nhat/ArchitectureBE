package org.archi.core.repo.campaign;

import org.archi.core.entity.PuzzleStatus;
import org.archi.core.entity.campaign.Puzzle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PuzzleRepo extends JpaRepository<Puzzle, Long> {

  List<Puzzle> findAllByStatus(PuzzleStatus status);
  Puzzle findById(long id);
  Page<Puzzle> findAll(Specification<Puzzle> specs, Pageable pageable);
}
