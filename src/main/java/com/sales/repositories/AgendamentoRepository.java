package com.sales.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sales.domain.Agendamento;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer>{

}
