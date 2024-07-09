package com.dbl.desafioemprestimo.consultaemprestimo.dto

import com.dbl.desafioemprestimo.consultaemprestimo.EmprestimoTipo

data class EmprestimoRespostaDTO(
    var tipo: EmprestimoTipo,
    var porcentagem: Int
)
