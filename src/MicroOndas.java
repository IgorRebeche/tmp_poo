
import java.util.Scanner;

public class MicroOndas extends Eletronico{
    int potenciaMaxima, potenciaMinima;
    Porta p1 = new Porta();

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public int getPotenciaMinima() {
        return potenciaMinima;
    }

    public void setPotenciaMinima(int potenciaMinima) {
        this.potenciaMinima = potenciaMinima;
    }

    public Porta getP1() {
        return p1;
    }

    public void setP1(Porta p1) {
        this.p1 = p1;
    }

    public MicroOndas(){
        
    }
    
    public MicroOndas(int potenciaMaxima){
        this.potenciaMaxima = potenciaMaxima;
    }
    
    public MicroOndas(int potenciaMaxima, int potenciaMinima) {
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaMinima = potenciaMinima;
    }

    public MicroOndas(int potenciaMaxima, int potenciaMinima, String marca, String modelo, int volume, double preco, Porta porta1) {
        super(marca, modelo, volume, preco, porta1);
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaMinima = potenciaMinima;
    }

    public MicroOndas(int potenciaMaxima, int potenciaMinima, String marca, String modelo, int volume, double preco) {
        super(marca, modelo, volume, preco);
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaMinima = potenciaMinima;
    }

    public MicroOndas(int potenciaMaxima, int potenciaMinima, String marca, String modelo, int volume) {
        super(marca, modelo, volume);
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaMinima = potenciaMinima;
    }

    public MicroOndas(int potenciaMaxima, int potenciaMinima, String marca, String modelo) {
        super(marca, modelo);
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaMinima = potenciaMinima;
    }

    public MicroOndas(int potenciaMaxima, int potenciaMinima, String marca) {
        super(marca);
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaMinima = potenciaMinima;
    }

    public MicroOndas(int potenciaMaxima, int potenciaMinima, String modelo, int volume, double preco, Porta porta1) {
        super(modelo, volume, preco, porta1);
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaMinima = potenciaMinima;
    }

    public MicroOndas(int potenciaMaxima, int potenciaMinima, int volume, double preco, Porta porta1) {
        super(volume, preco, porta1);
        this.potenciaMaxima = potenciaMaxima;
        this.potenciaMinima = potenciaMinima;
    }
    
    public void cadastrar(int potenciaMaxiam, int potenciaMinima, String marca,
        String modelo, int volume, double preco, Porta p1){
        super.cadastrar(marca, modelo, volume, preco, porta1);
        setPotenciaMaxima(potenciaMaxima);
        setPotenciaMinima(potenciaMinima);
    }
    
    public void entradaDados(){
        super.entradaDados();
        Scanner input = new Scanner(System.in);
        System.out.print("Potência máxima: ");
        setPotenciaMaxima(Integer.parseInt(input.nextLine()));
        System.out.print("Potência mínima: ");
        setPotenciaMinima(Integer.parseInt(input.nextLine()));
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Potência máxima: "+getPotenciaMaxima());
        System.out.println("Potêcia mínima: "+getPotenciaMinima());
    }
}
