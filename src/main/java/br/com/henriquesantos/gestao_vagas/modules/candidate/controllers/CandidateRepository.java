package br.com.henriquesantos.gestao_vagas.modules.candidate.controllers;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.henriquesantos.gestao_vagas.modules.candidate.CandidateEntity;

public interface CandidateRepository extends JpaRepository<CandidateEntity, UUID> {

}
