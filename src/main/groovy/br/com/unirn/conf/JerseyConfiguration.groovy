package br.com.unirn.conf

import br.com.unirn.rest.SampleRest
import org.glassfish.jersey.server.ResourceConfig
import org.springframework.context.annotation.Configuration

import javax.ws.rs.ApplicationPath

/**
 * Created by romulofc on 07/04/17.
 */
@Configuration
@ApplicationPath("rest")
class JerseyConfiguration extends ResourceConfig{


    JerseyConfiguration(){
        register(SampleRest.class)
    }
}

