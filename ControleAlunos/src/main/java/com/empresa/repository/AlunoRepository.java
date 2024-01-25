package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entites.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	

}
