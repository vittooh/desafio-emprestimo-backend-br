package com.dbl.desafioemprestimo.consultaemprestimo.estrategia

import com.dbl.desafioemprestimo.consultaemprestimo.ConsultaEmprestimoService
import com.dbl.desafioemprestimo.consultaemprestimo.dto.ConsultaEmprestimoRespostaDTO
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/customer-loans")
class ConsultaEmprestimoController(
    val consultaEmprestimoService: ConsultaEmprestimoService
) {


    @PostMapping
    fun validaEmprestimo(@RequestBody usuarioEmprestimo: UsuarioEmprestimo): ConsultaEmprestimoRespostaDTO {
        return consultaEmprestimoService.consultaEmprestimoUsuario(
            usuarioEmprestimo
        )
    }
}