package digitahouse.desafio01.michelle

import java.util.*

data class DigitalHouseManager(
    var alunos: MutableList<Aluno> = mutableListOf(),
    var professoresAdjunto: MutableList<ProfessorAdjunto> = mutableListOf(),
    var professoresTitular: MutableList<ProfessorTitular> = mutableListOf(),
    var cursos: MutableList<Curso> = mutableListOf(),
    var matriculas: MutableList<Matricula> = mutableListOf(),
) {
    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        if (cursos.firstOrNull { curso -> curso.codigoCurso == codigoCurso } == null) {
            cursos.add(Curso(nome = nome, codigoCurso = codigoCurso, qtdAlunosMax = quantidadeMaximaDeAlunos))
        }
    }

    fun excluirCurso(codigoCurso: Int) {
        val curso = cursos.firstOrNull { curso -> curso.codigoCurso == codigoCurso }
        if (curso != null) {
            cursos.remove(curso)
        }
    }

    fun registrarProfessorAdjunto(
        nome: String, sobrenome: String,
        codigoProfessor: Int, quantidadeDeHoras: Int,
    ) {
        if (professoresAdjunto.firstOrNull { professor -> professor.codigoProfessor == codigoProfessor } == null) {
            professoresAdjunto.add(ProfessorAdjunto(
                qtdHoras = quantidadeDeHoras,
                nome = nome,
                sobrenome = sobrenome,
                tempoCasa = 0,
                codigoProfessor = codigoProfessor
            ))
        }
    }

    fun registrarProfessorTitular(
        nome: String, sobrenome: String,
        codigoProfessor: Int, especialidade: String,
    ) {
        if (professoresTitular.firstOrNull { professor -> professor.codigoProfessor == codigoProfessor } == null) {
            professoresTitular.add(ProfessorTitular(especialidade = especialidade,
                nome = nome,
                sobrenome = sobrenome,
                tempoCasa = 0,
                codigoProfessor = codigoProfessor))
        }
    }

    /*fun excluirProfessor(codigoProfessor: Integer){
        val professor = cursos.firstOrNull { curso -> curso.codigoCurso.equals(codigoCurso) }
        if (curso != null) {
            cursos.remove(curso)
        }
    }*/

    fun adicionarAluno(
        nome: String, sobrenome: String,
        codigoAluno:
        Int,
    ) {
        if (alunos.firstOrNull { aluno -> aluno.codigoAluno == codigoAluno } == null) {
            alunos.add(Aluno(nome = nome, sobrenome = sobrenome, codigoAluno = codigoAluno))
        }
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val curso = cursos.firstOrNull { curso -> curso.codigoCurso == codigoCurso } ?: return
        val aluno = alunos.firstOrNull { aluno -> aluno.codigoAluno == codigoAluno } ?: return

        if (curso.adicionarUmAluno(aluno)) {
            matriculas.add(Matricula(aluno, curso, Date()))
            println("Matricula realizada com sucesso!")
        } else {
            println("Não foi possivel realizar a matricula. Não há vagas!")
        }
    }

    fun alocarProfessores(
        codigoCurso: Int,
        codigoProfessorTitular: Int,
        codigoProfessorAdjunto:
        Int,
    ) {
        val professorAdjunto =
            professoresAdjunto.firstOrNull { professor -> professor.codigoProfessor == codigoProfessorAdjunto }
                ?: return

        val professorTitular =
            professoresTitular.firstOrNull { professor -> professor.codigoProfessor == codigoProfessorTitular }
                ?: return

        val curso = cursos.firstOrNull { curso -> curso.codigoCurso.equals(codigoCurso) } ?: return

        curso.adicionarProfAdjunto(professorAdjunto)
        curso.adicionarProfTitular(professorTitular)
    }

}