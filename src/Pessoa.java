public class Pessoa extends Animal{

    //Atributos de Classe
    public String sobrenome;

    //Metodos de classe
    public void falar(){
        System.out.println("falei");
    }
    public String falar(String texto){
        return texto;
    }
    public void comer(){
        System.out.println("pessoa comeu");
    }
}
