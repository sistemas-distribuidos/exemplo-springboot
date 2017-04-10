package br.com.unirn.conf

import br.com.unirn.domain.Contato
import br.com.unirn.domain.Grupo
import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter

/**
 * Created by romulofc on 07/04/17.
 */
@Configuration
class RepositoryConfig extends RepositoryRestConfigurerAdapter{

    @Override
    void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Contato.class,Grupo.class)
        super.configureRepositoryRestConfiguration(config)
    }
}

