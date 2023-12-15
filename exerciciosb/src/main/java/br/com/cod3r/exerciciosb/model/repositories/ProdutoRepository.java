package br.com.cod3r.exerciciosb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.cod3r.exerciciosb.model.entities.Produto;

public interface ProdutoRepository
		extends CrudRepository<Produto, Integer>, PagingAndSortingRepository<Produto, Integer> {
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String nome);
	
	@Query("SELECT p from Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
	
}
