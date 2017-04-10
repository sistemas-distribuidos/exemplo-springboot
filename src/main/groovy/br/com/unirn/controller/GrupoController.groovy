package br.com.unirn.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * Created by romulofc on 07/04/17.
 */
@Controller
@RequestMapping("/grupo")
class GrupoController {

    @RequestMapping("/index")
    def index(){
        return "index"
    }
}
