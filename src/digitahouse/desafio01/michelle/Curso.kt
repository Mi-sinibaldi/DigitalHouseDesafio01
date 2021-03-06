package digitahouse.desafio01.michelle

data class Curso(
    var nome: String,
    var codigoCurso: Int,
    var professorAdjunto: ProfessorAdjunto? = null,
    var professorTitular: ProfessorTitular? = null,
    var qtdAlunosMax: Int,
    var alunos: MutableList<Aluno> = mutableListOf()
) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Curso) return false
        return codigoCurso == other.codigoCurso
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return qtdAlunosMax >= alunos.count()
    }

    fun adicionarProfAdjunto(umProfessor: ProfessorAdjunto) {
         professorAdjunto = umProfessor
    }

    fun adicionarProfTitular(umProfessor: ProfessorTitular) {
        professorTitular = umProfessor
    }

    fun excluirAluno(umAluno: Aluno){
        alunos.remove(umAluno)
    }
}