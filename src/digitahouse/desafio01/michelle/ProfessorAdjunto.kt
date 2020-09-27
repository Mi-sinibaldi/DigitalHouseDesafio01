package digitahouse.desafio01.michelle

import digitahouse.desafio01.michelle.Professor as Professor

data class ProfessorAdjunto(
    var qtdHoras: Int,
    override var nome: String,
    override var sobrenome: String,
    override var tempoCasa: Int,
    override var codigoProfessor: Int
) : Professor