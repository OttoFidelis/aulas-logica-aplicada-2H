public class Main {
    public static void main(String[] args) {
    int cont = 0;
    while (cont<10){
        System.out.println("Contador = "+cont);
        cont++;
    }
    for (int  x=0; x<10;x++){
        System.out.println("Contador = "+x);
    }

    cont = 1;
    do{
        System.out.println("contador = "+ cont);
        cont++;
    }
    while(cont<=10);

}
}