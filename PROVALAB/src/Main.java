public class Main {
    public static void main(String[] args) {
        Capitao capitao = new Capitao("Harry Potter", "Abobora", 200, 0);

        Espadachim espadachim = new Espadachim("Rony", "Estrogonofe", 120);
        capitao.conquistarNovoSeguidor(espadachim);

        Cozinheiro cozinheiro = new Cozinheiro("Cedrico", "Lentilhas", 50);
        capitao.conquistarNovoSeguidor(cozinheiro);


        cozinheiro.getLivroDeReceitas().add(
                new Receita("Abobora", 10)
        );

        cozinheiro.getLivroDeReceitas().add(
                new Receita("Carne", 20)
        );

        cozinheiro.mostrarReceitas();

        espadachim.darOrdens();
        capitao.mudarRota();

        System.out.println("Poder do capitao antes de comer");
        System.out.println(capitao.getPoder());

        capitao.comer(cozinheiro, 1);

        System.out.println("Poder do capitao depois de comer");
        System.out.println(capitao.getPoder());

        Espadachim espadachimSegundo = new Espadachim("Mulan", "Carne", 1000);
        capitao.conquistarNovoSeguidor(espadachimSegundo);



        System.out.println("Poder do capitao antes de comer");
        System.out.println(capitao.getPoder());

        capitao.comer(cozinheiro, 0);

        System.out.println("Poder do capitao depois de comer");
        System.out.println(capitao.getPoder());

        Pirata vitorioso = capitao.lutar(espadachim);
        System.out.println(vitorioso.getNome() + " foi vitorioso");
    }
}
