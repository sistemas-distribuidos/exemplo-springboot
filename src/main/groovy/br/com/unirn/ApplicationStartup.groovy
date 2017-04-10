package br.com.unirn

import br.com.unirn.domain.Contato
import br.com.unirn.domain.Grupo
import br.com.unirn.repository.ContatoRepository
import br.com.unirn.repository.GrupoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

/**
 * Created by romulofc on 07/04/17.
 */
@Component
class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent>{

    @Autowired
    ContatoRepository contatoRepository

    @Autowired
    GrupoRepository grupoRepository

    @Override
    void onApplicationEvent(ApplicationReadyEvent event) {
        def grupo = grupoRepository.findByNome("Familia")
        if(!grupo){
            grupo = grupoRepository.save(new Grupo(nome: "Familia"))
        }

        def contato = contatoRepository.findByNome("Romulo Fagundes")
        if(!contato){
            contatoRepository.save(
                    new Contato(nome: "Romulo Fagundes",telefone: "1111-1111",grupo: grupo))
        }
    }
}
