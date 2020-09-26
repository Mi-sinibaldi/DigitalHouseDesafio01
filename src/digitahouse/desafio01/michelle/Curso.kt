package digitahouse.desafio01.michelle

data class Curso(
    var nome: String,
    var codigoCurso: Int,
    var projessorAdjunto: ProjessorAdjunto,
    var professorTitular: ProfessorTitular,
    var qtdAlunosMax: Int,
    var alunos: List<Aluno>
) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Curso) return false
        return codigoCurso == other.codigoCurso
    }
}