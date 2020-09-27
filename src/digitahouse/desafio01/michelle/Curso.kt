package digitahouse.desafio01.michelle

data class Curso(
    var nome: String,
    var codigoCurso: Int,
    var projessorAdjunto: ProjessorAdjunto,
    var professorTitular: ProfessorTitular,
    var qtdAlunosMax: Int,
    var alunos: MutableList<Aluno>
) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Curso) return false
        return codigoCurso == other.codigoCurso
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return qtdAlunosMax < alunos.count()
    }

    fun excluirAluno(umAluno: Aluno){
        alunos.remove(umAluno)
    }
}