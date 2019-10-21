
import java.util.Scanner;

public class Porta {
    double comprimento, largura;
    boolean vidros;

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public boolean getVidros() {
        return vidros;
    }

    public void setVidros(boolean vidros) {
        this.vidros = vidros;
    }

    public Porta(){
        
    }
    
    public Porta(double comprimento, double largura, boolean vidros) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.vidros = vidros;
    }
    
    public Porta(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public Porta(double comprimento) {
        this.comprimento = comprimento;
    }
    
    public Porta(double largura, boolean vidros) {
        this.largura = largura;
        this.vidros = vidros;
    }
    
    public Porta(boolean vidros) {
        this.vidros = vidros;
    }
    
    public Porta(boolean vidros, double comprimento, double largura) {
        this.vidros = vidros;
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
   public Porta(double largura, boolean vidros, double comprimento) {
       this.largura = largura;
       this.vidros = vidros;
       this.comprimento = comprimento;
    } 
    
    public void cadastrar(double comprimento, double largura, boolean vidros){
        setComprimento(comprimento);
        setLargura(largura);
        setVidros(vidros);
    }
    
    public void entradaDados(){
        Scanner input = new Scanner(System.in);
        System.out.println("** Dados da Porta **");
        System.out.print("Comprimento: ");
        setComprimento(Double.parseDouble(input.nextLine()));
        System.out.print("Largura: ");
        setLargura(Double.parseDouble(input.nextLine()));
        System.out.print("A porta possui vidros: ");
        String possui;
        possui = input.nextLine();
        if(possui.equals("sim")){
            setVidros(true);
        }else
            setVidros(false);
    }
   
    public void imprimir(){
        System.out.println("\n** Dados a serem impressos da Porta **");
        System.out.println("Comprimento: "+getComprimento());
        System.out.println("Largura: "+getLargura());

        if(getVidros() == true){
            System.out.println("A porta possui vidros");
        }else
            System.out.println("A porta não possui vidros");
    }
}
