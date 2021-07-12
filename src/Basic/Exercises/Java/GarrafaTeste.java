package Basic.Exercises.Java;

public class GarrafaTeste {
    public static void main(String[] args) {

        Garrafa garrafa = new Garrafa();

        garrafa.setCor("incolor");
        garrafa.setFormato("Redonda");
        garrafa.setTamanho("media");
        garrafa.setAberto(false);
        garrafa.setCapacidadeAgua(750);

        garrafa.mostrarInfo();
        garrafa.fechado();
        garrafa.abrir();
        garrafa.verificarEstado();

        garrafa.adicionarAgua(5);{
            if (garrafa.getCapacidadeAgua() > 750){
                System.out.println("você esta adicionando muita agua");
            } else {
                System.out.println("Agua adicionada");
            }
        }

        garrafa.retirarAgua(100);
        System.out.println();
        garrafa.verificarQtdAgua();

    }
}
