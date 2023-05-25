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



    }
}