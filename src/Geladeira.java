
import java.util.Scanner;

public class Geladeira extends Eletronico{
    double temperaturaMaxima, temperaturaMinima;
    //Criar instancia de porta 
    Porta m1;
    Porta m2;

    public double getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    public void setTemperaturaMaxima(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public double getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(double temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    //public Porta getM1() {
    //    return m1;
    //}

    //public void setM1(Porta m1) {
    //    this.m1 = m1;
    //}

    //public Porta getM2() {
    //    return m2;
    //}

    //public void setM2(Porta m2) {
    //    this.m2 = m2;
    //}
    
    public Geladeira(){
        
    }
    
    public Geladeira(double temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Geladeira(double temperaturaMaxima, double temperaturaMinima) {
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }
    
    public Geladeira(double temperaturaMaxima, double temperaturaMinima, String marca, String modelo, int volume, double preco, Porta porta1) {
        super(marca, modelo, volume, preco, porta1);
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public Geladeira(double temperaturaMaxima, double temperaturaMinima, String marca, String modelo, int volume, double preco) {
        super(marca, modelo, volume, preco);
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public Geladeira(double temperaturaMaxima, double temperaturaMinima, String marca, String modelo, int volume) {
        super(marca, modelo, volume);
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public Geladeira(double temperaturaMaxima, double temperaturaMinima, String marca, String modelo) {
        super(marca, modelo);
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public Geladeira(double temperaturaMaxima, double temperaturaMinima, String marca) {
        super(marca);
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public Geladeira(double temperaturaMaxima, double temperaturaMinima, String modelo, int volume, double preco, Porta porta1) {
        super(modelo, volume, preco, porta1);
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }

    public Geladeira(double temperaturaMaxima, double temperaturaMinima, int volume, double preco, Porta porta1) {
        super(volume, preco, porta1);
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
    }
    
    public void cadastrar(double temperaturaMaxima, double temperaturaMinima, 
            String marca, String modelo, int volume, double preco, Porta m1, Porta m2){
        super.cadastrar(marca, modelo, volume, preco, porta1);
        setTemperaturaMaxima(temperaturaMaxima);
        setTemperaturaMinima(temperaturaMinima);
    }
    
    public void entradaDados(){
        super.entradaDados();
        Scanner input = new Scanner(System.in);
        System.out.print("Temperatura máxima: ");
        setTemperaturaMaxima(Double.parseDouble(input.nextLine()));
        System.out.print("Temperatura mínima: ");
        setTemperaturaMinima(Double.parseDouble(input.nextLine()));
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Temperatura máxima: "+getTemperaturaMaxima());
        System.out.println("Temperatura mínima: "+getTemperaturaMinima());
    }
}
