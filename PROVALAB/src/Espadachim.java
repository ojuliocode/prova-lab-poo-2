public class Espadachim extends Pirata implements Comandar{
    private String nomeDaEspada;

    public String getNomeDaEspada() {
        return nomeDaEspada;
    }

    public void setNomeDaEspada(String nomeDaEspada) {
        this.nomeDaEspada = nomeDaEspada;
    }

    public Espadachim(String nome, String comidaFavorita, int poder){
        super(nome, comidaFavorita, poder);
    }
    public void darOrdens(){
        System.out.println("O imediato esta ordenando os tripulantes");
    }

    public void mudarRota(){
        System.out.println("O imediato esta mudando a rota");
    }
}
