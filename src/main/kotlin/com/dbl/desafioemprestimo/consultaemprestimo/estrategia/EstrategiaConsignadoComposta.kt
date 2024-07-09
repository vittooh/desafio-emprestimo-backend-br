package com.dbl.desafioemprestimo.consultaemprestimo.estrategia

import com.dbl.desafioemprestimo.consultaemprestimo.EmprestimoTipo

class EstrategiaConsignadoComposta : EstrategiaEmprestimo {
    override fun calculaEmprestimo(idade: Int, salario: Double, regiao: String): EmprestimoTipo? {
        return when {
            salario > 3000 && salario < 5000 && idade < 30 && regiao == "SP" -> EmprestimoTipo.CONSIGNADO
            else -> null
        }
    }
}