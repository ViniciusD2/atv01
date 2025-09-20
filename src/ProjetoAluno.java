public class ProjetoAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "João";
        aluno1.matricula = 123;
        aluno1.notaAv1 = 8.0;
        aluno1.notaAv2 = 6.0;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.matricula = 456;
        aluno2.notaAv1 = 5.0;
        aluno2.notaAv2 = 7.0;

        aluno1.mostrarDados();
        aluno1.verificarAprovacao();

        aluno2.notaAv2 = 8.5; // atualização
        aluno2.mostrarDados();
        aluno2.verificarAprovacao();
    }

    public static class Aluno {
        String nome;
        int matricula;
        double notaAv1;
        double notaAv2;

        void mostrarDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + matricula);
            System.out.println("Av1: " + notaAv1 + " | Av2: " + notaAv2);
        }

        double calcularMedia() {
            return (notaAv1 + notaAv2) / 2;
        }

        void verificarAprovacao() {
            double media = calcularMedia();
            if (media >= 7.0) {
                System.out.println(nome + " está APROVADO! Média: " + media);
            } else {
                System.out.println(nome + " está REPROVADO. Média: " + media);
            }
        }
    }
}
