package digitahouse.desafio01.michelle

data class ProfessorTitular(
    var especialidade: String,
    override var nome: String,
    override var sobrenome: String,
    override var tempoCasa: Int,
    override var codigoProfessor: Int
): Professor