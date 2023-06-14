public class Solo {
    //atributos
    String tipoSolo;
    String cor;
    boolean fertil;
    //método
    public Planta gerarPlanta(Semente s1){
        Planta p1 = new Planta(s1);
        return p1;
    }
}
