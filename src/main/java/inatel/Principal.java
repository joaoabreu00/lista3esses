package inatel;

public class Principal {

    public static void main(String[] args) {

    Pessoa p = new Pessoa("Joao", 213123123, 3);

    Endereco endereco1 = new Endereco("Jose pinto vilela", "Maristela", 286);
    Endereco endereco2 = new Endereco("Silvestre Ferraz", "Centro", 215);
    Endereco endereco3 = new Endereco("Procopoio", "Horto", 8745);

    p.addEnd(endereco1);
    p.addEnd(endereco2);
    p.addEnd(endereco3);

    p.mostraInfo();

    }



}
