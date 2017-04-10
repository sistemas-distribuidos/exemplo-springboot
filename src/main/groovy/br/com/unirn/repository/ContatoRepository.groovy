package br.com.unirn.repository

import br.com.unirn.domain.Contato
import br.com.unirn.domain.Grupo
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by romulofc on 07/04/17.
 */
@RepositoryRestResource(collectionResourceRel = "contato",path = "contato")
interface ContatoRepository  extends CrudRepository<Contato,Long> {

    Contato findByNome(@Param("nome") String nome)

    List<Contato> findByNomeContainsIgnoreCase(@Param("nome") String nome)

}

