
import java.util.Scanner;

public class Eletronico {
    String marca, modelo;
    int volume;
    double preco;
    Porta porta1 = new Porta();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta porta1) {
        this.porta1 = porta1;
    }

    public Eletronico(){
        
    }
    
    public Eletronico(String marca, String modelo, int volume, double preco, Porta porta1) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.preco = preco;
        this.porta1 = porta1;
    }
    
    public Eletronico(String marca, String modelo, int volume, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
        this.preco = preco;
    }
    
    public Eletronico(String marca, String modelo, int volume) {
        this.marca = marca;
        this.modelo = modelo;
        this.volume = volume;
    }
    
    public Eletronico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Eletronico(String marca) {
        this.marca = marca;
    }
    
    public Eletronico(String modelo, int volume, double preco, Porta porta1) {
        this.modelo = modelo;
        this.volume = volume;
        this.preco = preco;
        this.porta1 = porta1;
    }
    
    public Eletronico(int volume, double preco, Porta porta1) {
        this.volume = volume;
        this.preco = preco;
        this.porta1 = porta1;
    }
    
    public void cadastrar(String marca, String modelo, int volume, double preco, Porta porta1){
        setMarca(marca);
        setModelo(modelo);
        setVolume(volume);
        setPreco(preco);
        setPorta1(porta1);
    }
    
    public void entradaDados(){
        Scanner input = new Scanner(System.in);
        System.out.println("** Dados a serem cadastrados **");
        System.out.print("Marca: ");
        setMarca(input.nextLine());
        System.out.print("Modelo: ");
        setModelo(input.nextLine());
        System.out.print("Volume: ");
        setVolume(Integer.parseInt(input.nextLine()));
        System.out.print("Preço: ");
        setPreco(Double.parseDouble(input.nextLine()));
        System.out.print("Porta: ");
        //setPorta1(input.nextLine());
    }
    
    public void imprimir(){
        System.out.println("\n** Dados a serem impressos **");
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Volume: "+getVolume());
        System.out.println("Preço: "+getPreco());
        System.out.println("Porta: "+getPorta1());
    }
}
