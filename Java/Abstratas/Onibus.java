package Java.Abstratas;

public class Onibus extends Veiculo {

    @Override
    public void ligar() {
        System.out.println("Ligando o ônibus");
    }

    @Override
    public void transportar() {
        System.out.println("Transportando passageiros");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o ônibus");
    }
}
