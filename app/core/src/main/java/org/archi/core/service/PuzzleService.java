package org.archi.core.service;

import lombok.AllArgsConstructor;
import org.archi.core.entity.Puzzle;
import org.archi.core.entity.PuzzleStatus;
import org.archi.core.repo.PuzzleRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PuzzleService {
  private final PuzzleRepo puzzleRepo;

  List<Puzzle> findAllByStatus(PuzzleStatus status) {
    return puzzleRepo.findAllByStatus(status);
  }

  public Puzzle save(Puzzle puzzle) {
    return puzzleRepo.save(puzzle);
  }

  public Page<Puzzle> findAll(Specification<Puzzle> specs, Pageable pageable) {
    return puzzleRepo.findAll(specs, pageable);
  }

  public Puzzle findById(long id) {
    return puzzleRepo.findById(id).orElse(null);
  }
}
