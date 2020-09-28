package digitahouse.desafio01.michelle

var digitalHouseManager: DigitalHouseManager = DigitalHouseManager()
fun main() {

    digitalHouseManager.registrarProfessorAdjunto("Marina", "Lopes", 1, 4)
    digitalHouseManager.registrarProfessorAdjunto("Henrique", "Paxi", 2, 6)
    digitalHouseManager.registrarProfessorTitular("Cleyton", "Evannescleyson", 1, "Especialista Sr")
    digitalHouseManager.registrarProfessorTitular("Murilo", "Paxi", 2, "Arquiteto de Software")

    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.alocarProfessores(20001, 1, 1)
    digitalHouseManager.alocarProfessores(20002, 2, 2)

    digitalHouseManager.adicionarAluno("Arthur", "Rocha", 1)
    digitalHouseManager.adicionarAluno("Ana", "Silva", 2)
    digitalHouseManager.adicionarAluno("Marcos", "Araujo", 3)
    digitalHouseManager.adicionarAluno("Gabriela", "Alvez", 4)
    digitalHouseManager.adicionarAluno("Luiz", "Serra", 5)

    digitalHouseManager.matricularAluno(1, 20001)
    digitalHouseManager.matricularAluno(2, 20001)
    digitalHouseManager.matricularAluno(3, 20001)
    digitalHouseManager.matricularAluno(4, 20002)
    digitalHouseManager.matricularAluno(5, 20002)
}