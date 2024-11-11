import java.util.ArrayList;

abstract class Veiculo {
    protected String placa;
    protected int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public abstract double calcularValorSeguro();

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa + ", Ano: " + ano);
    }
}

interface Manutencao {
    String realizarManutencao();
}

class Carro extends Veiculo implements Manutencao {
    private int numeroPortas;

    public Carro(String placa, int ano, int numeroPortas) {
        super(placa, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularValorSeguro() {
        return 500.0 + (numeroPortas * 100.0);
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção realizada para o carro com placa: " + placa;
    }
}

class Moto extends Veiculo implements Manutencao {
    private int cilindrada;

    public Moto(String placa, int ano, int cilindrada) {
        super(placa, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularValorSeguro() {
        return 300.0 + (cilindrada * 0.1);
    }
    @Override
    public String realizarManutencao() {
        return "Manutenção realizada para a moto com placa: " + placa;
    }
}

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        Carro carro1 = new Carro("ABC1234", 2020, 4);
        Carro carro2 = new Carro("DEF5678", 2019, 2);
        Moto moto1 = new Moto("XYZ9876", 2018, 600);
        Moto moto2 = new Moto("GHI3456", 2021, 1000);

        listaVeiculos.add(carro1);
        listaVeiculos.add(carro2);
        listaVeiculos.add(moto1);
        listaVeiculos.add(moto2);

        for (Veiculo veiculo : listaVeiculos) {
            veiculo.exibirDetalhes();
            System.out.println("Valor do Seguro: R$ " + veiculo.calcularValorSeguro());
            if (veiculo instanceof Manutencao) {
                Manutencao manutencao = (Manutencao) veiculo;
                System.out.println(manutencao.realizarManutencao());
            }

            System.out.println("-------------------------");
        }
    }
}
