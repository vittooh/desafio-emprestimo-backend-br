package com.dbl.desafioemprestimo.consultaemprestimo.estrategia

import com.dbl.desafioemprestimo.consultaemprestimo.EmprestimoTipo

interface EstrategiaEmprestimo {

    fun calculaEmprestimo(idade: Int, salario: Double, regiao: String): EmprestimoTipo?
}