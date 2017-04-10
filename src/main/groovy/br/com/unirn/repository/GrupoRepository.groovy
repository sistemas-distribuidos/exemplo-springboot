package br.com.unirn.repository

import br.com.unirn.domain.Grupo
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by romulofc on 07/04/17.
 */
@RepositoryRestResource(collectionResourceRel = "grupo",path = "grupo")
interface GrupoRepository extends CrudRepository<Grupo,Long> {

    Grupo findByNome(@Param("nome") String nome)
}