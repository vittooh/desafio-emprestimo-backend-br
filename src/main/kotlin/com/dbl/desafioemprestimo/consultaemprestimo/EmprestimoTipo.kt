package com.dbl.desafioemprestimo.consultaemprestimo

enum class EmprestimoTipo(val porcentagem: Int) {
    PESSOAL(4),
    CONSIGNADO(2),
    GARANTIA(3)
}