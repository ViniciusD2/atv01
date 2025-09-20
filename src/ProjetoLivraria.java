public class ProjetoLivraria {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Harry Potter e a Pedra Filosofal";
        livro1.numeroPaginas = 304;
        livro1.anoPublicacao = 1997;
        livro1.preco = 29.90;

        Livro livro2 = new Livro();
        livro2.titulo = "Senhor dos Anéis";
        livro2.numeroPaginas = 500;
        livro2.anoPublicacao = 1954;
        livro2.preco = 59.90;

        System.out.println("ProjetoLivraria.Livro 1: " + livro1.titulo + " - R$ " + livro1.preco);
        System.out.println("ProjetoLivraria.Livro 2: " + livro2.titulo + " - R$ " + livro2.preco);

        livro1.cadastrar();
        livro2.vender();
        double frete = livro1.calcFrete("66097-055");
        System.out.printf("Frete calculado: R$ %.2f%n", frete);

        System.out.println("Resultado da troca: " + livro1.trocar());
    }

    public static class Livro {
        String titulo;
        int numeroPaginas;
        int anoPublicacao;
        double preco;

        void cadastrar() {
            System.out.println("Cadastrando no banco de dados...");
        }

        double calcFrete(String cep) {
            System.out.println("Calculando frete para o CEP " + cep);
            return 15.50; // valor fictício
        }

        void vender() {
            System.out.printf("Vendendo livro por R$ %.2f%n", preco);
        }

        String trocar() {
            return "ProjetoLivraria.Livro trocado!";
        }
    }
}

