public class Main {
    public static void main(String[] args) {
        // Aula inreodutória de OO

        // Declaração de objeto
        Pessoa adao;

        // Instanciação do objeto
        adao = new Pessoa();

        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();

        // Definir formato do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        qualquer.falar();
        System.out.println(qualquer.falar("oi"));
        // Criar novos objetos
        Pessoa rainha;
        // Instanciar objetos
        rainha = new Pessoa();
        // Definir forma de objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        // Definição de comportamento
        rainha.falar();
        rainha.comer();

        Produto p1 = new Produto(1300.00);
        Produto p2 = new Produto();
        p2.setPreco(233.00);
        Produto p3;
        p2 = new Produto("Placa de vídeo",1300.00);
        p3 = new Produto("Placa mãe",2500.00);

    }
}