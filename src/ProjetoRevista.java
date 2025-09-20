public class ProjetoRevista {
    public static void main(String[] args) {
        Revista revista1 = new Revista();
        revista1.titulo = "ProjetoRevista.Revista Ciência Hoje";
        revista1.numeroEdicao = 120;
        revista1.preco = 12.50;

        revista1.cadastrar();
        revista1.exibirInfo();
    }

    public static class Revista {
        String titulo;
        int numeroEdicao;
        double preco;

        void cadastrar() {
            System.out.println("ProjetoRevista.Revista cadastrada no sistema.");
        }

        void exibirInfo() {
            System.out.println("Título: " + titulo + " | Edição: " + numeroEdicao + " | Preço: R$ " + preco);
        }
    }
}
