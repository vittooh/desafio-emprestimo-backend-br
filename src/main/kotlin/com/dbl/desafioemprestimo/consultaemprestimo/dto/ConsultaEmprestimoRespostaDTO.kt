package com.dbl.desafioemprestimo.consultaemprestimo.dto

data class ConsultaEmprestimoRespostaDTO(
    var nomeCliente: String,
    var emprestimos: List<EmprestimoRespostaDTO>
)