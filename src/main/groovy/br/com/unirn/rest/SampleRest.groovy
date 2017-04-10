package br.com.unirn.rest

import org.springframework.stereotype.Component

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

/**
 * Created by romulofc on 07/04/17.
 */
@Component
@Path("/sample")
class SampleRest {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Map exemplo(){
        def mapa = [:]
        mapa.mensagem = "Alo Mundo!"

        mapa
    }
}

