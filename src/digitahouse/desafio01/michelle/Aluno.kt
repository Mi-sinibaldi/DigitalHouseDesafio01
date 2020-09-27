package digitahouse.desafio01.michelle

data class Aluno(
    var nome: String,
    var sobrenome: String,
    var codigoAluno: Integer
)
{
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Aluno) return false
        return codigoAluno == other.codigoAluno
    }
}


