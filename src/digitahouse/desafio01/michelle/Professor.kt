package digitahouse.desafio01.michelle

data class Professor(
    var nome: String,
    var sobrenome: String,
    var tempoCasa: Int,
    var codigoProfessor: Int
) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Professor) return false
        return codigoProfessor == other.codigoProfessor
    }
}