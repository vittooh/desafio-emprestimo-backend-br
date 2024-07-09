package com.dbl.desafioemprestimo.consultaemprestimo.estrategia

import com.dbl.desafioemprestimo.consultaemprestimo.EmprestimoTipo
import org.springframework.stereotype.Component

@Component
class EstrategiaGarantiaSimples : EstrategiaEmprestimo {
    override fun calculaEmprestimo(idade: Int, salario: Double, regiao: String): EmprestimoTipo? {
        return when {
            salario < 3000 -> EmprestimoTipo.GARANTIA
            else -> return null
        }
    }
}