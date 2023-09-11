package br.edu.univille.projefab2023_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.univille.projefab2023_2.entity.Cliente;

@Repository
public interface CLienteRepository extends JpaRepository<Cliente,Long>{

    }
