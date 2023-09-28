package br.edu.univille.projefab2023_2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.univille.projefab2023_2.entity.Cliente;

@Service
public interface ClienteService {
    List<Cliente> getAll();

    void save(Cliente cliente);
}
