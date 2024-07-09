package com.dbl.desafioemprestimo.consultaemprestimo

import com.dbl.desafioemprestimo.consultaemprestimo.dto.ConsultaEmprestimoRespostaDTO
import com.dbl.desafioemprestimo.consultaemprestimo.dto.EmprestimoRespostaDTO
import com.dbl.desafioemprestimo.consultaemprestimo.estrategia.EstrategiaEmprestimo
import com.dbl.desafioemprestimo.consultaemprestimo.estrategia.UsuarioEmprestimo
import org.springframework.stereotype.Service

@Service
class ConsultaEmprestimoService(
    var tipoEmprestimo: List<EstrategiaEmprestimo>
) {

    fun consultaEmprestimoUsuario(usuarioEmprestimo: UsuarioEmprestimo): ConsultaEmprestimoRespostaDTO {
        val tipoEmprestimos = mutableListOf<EmprestimoRespostaDTO>()
        val resultado = ConsultaEmprestimoRespostaDTO(
            usuarioEmprestimo.nome,
            tipoEmprestimos
        )
        tipoEmprestimo.forEach { tipoEmprestimoEstrategia ->
            val result = tipoEmprestimoEstrategia.calculaEmprestimo(
                usuarioEmprestimo.idade, usuarioEmprestimo.renda, usuarioEmprestimo.localizacao
            )
            if (result != null) {
                tipoEmprestimos.add(
                    EmprestimoRespostaDTO(
                        result, result.porcentagem
                    )
                )
            }
        }
        return resultado
    }
}