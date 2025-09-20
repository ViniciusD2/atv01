public class ProjetoCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2020;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2018;

        carro1.mostrarInfo();
        carro1.ligar();

        carro2.ano = 2022; // alteração
        carro2.mostrarInfo();
        carro2.ligar();
    }

    public static class Carro {
        String marca;
        String modelo;
        int ano;

        void mostrarInfo() {
            System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
        }

        void ligar() {
            System.out.println("O carro " + modelo + " está ligado!");
        }
    }
}
