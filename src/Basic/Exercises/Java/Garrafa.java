package Basic.Exercises.Java;

public class Garrafa {

    private String cor;
    private String formato;
    private String tamanho;
    private boolean aberto;
    private double capacidadeAgua;

    public Garrafa() { }

    public Garrafa(String cor, String formato, String tamanho, boolean aberto, double capacidadeAgua) {
        this.cor = cor;
        this.formato = formato;
        this.tamanho = tamanho;
        this.aberto = aberto;
        this.capacidadeAgua = capacidadeAgua;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public double getCapacidadeAgua() {
        return capacidadeAgua;
    }

    public void setCapacidadeAgua(double capacidadeAgua) {
        this.capacidadeAgua = capacidadeAgua;
    }

    public void mostrarInfo(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Formato: " + this.formato);
    }

    public void fechado(){
        this.aberto = false;
    }

    public void abrir(){
        this.aberto = true;
    }

    public void retirarAgua(int qtdARetirar){
        this.capacidadeAgua -= qtdARetirar;
    }

    public void adicionarAgua(int qtdAAdicionar){
        this.capacidadeAgua += qtdAAdicionar;
    }

    public void verificarEstado(){
        if (isAberto()){
            System.out.println("A garrafa esta aberta");
        } else {
            System.out.println("A garrafa esta fechada");
        }
    }

    public void verificarQtdAgua(){
        System.out.println("Na garrafa tem " + this.capacidadeAgua + " " + "ml");
    }

}
