package br.com.unirn.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.validation.constraints.NotNull

/**
 * Created by romulofc on 07/04/17.
 */
@Entity
class Contato {

    @Id
    @GeneratedValue
    Long id

    @NotNull
    String nome

    String telefone

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonInclude
    Grupo grupo


}

