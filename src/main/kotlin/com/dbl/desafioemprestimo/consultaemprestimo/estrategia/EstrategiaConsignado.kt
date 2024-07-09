package com.dbl.desafioemprestimo.consultaemprestimo.estrategia

import com.dbl.desafioemprestimo.consultaemprestimo.EmprestimoTipo
import org.springframework.stereotype.Component

@Component
class EstrategiaConsignado : EstrategiaEmprestimo {
    override fun calculaEmprestimo(idade: Int, salario: Double, regiao: String): EmprestimoTipo? {
        return when {
            salario >= 5000.0 -> EmprestimoTipo.CONSIGNADO
            else -> return null
        }
    }
}