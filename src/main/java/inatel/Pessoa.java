package inatel;

public class Pessoa {

    private final String nome;
    private final int cpf;
    private final int qndEnd;
    private final Endereco[] enderecos;


    public Pessoa(String nome, int cpf, int qndEnd) {

        this.nome = nome;
        this.cpf = cpf;
        this.qndEnd = qndEnd;
        enderecos = new Endereco[5];

    }

    void addEnd(Endereco novoEnd) {

        for (int i = 0; i < enderecos.length; i++) {

            if (enderecos[i] == null) {

                enderecos[i] = novoEnd;

                break;
            }
        }

    }

    void mostraInfo() {

        System.out.println("O " + this.nome + " do CPF " + this.cpf + " possui " + this.qndEnd + " endereços. São eles: ");
        for (Endereco endereco : enderecos) {

            if (endereco != null)
                System.out.println(endereco.getRua() + " " + endereco.getBairro() + " " + endereco.getNum());
        }


    }

}