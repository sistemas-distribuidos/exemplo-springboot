package br.com.unirn.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

/**
 * Created by romulofc on 07/04/17.
 */
@Entity
class Grupo {

    @Id
    @GeneratedValue
    Long id

    String nome

    @OneToMany(mappedBy = "grupo")
    List<Contato> contatos
}

