package com.devpgm.backend.repository;

import com.devpgm.backend.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}