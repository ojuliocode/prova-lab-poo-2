public class Capitao extends Pirata implements Comandar{
    private int numeroDeSeguidores;


    public Capitao(String nome, String comidaFavorita, int poder, int numeroDeSeguidores){
        super(nome, comidaFavorita, poder);
        this.numeroDeSeguidores = numeroDeSeguidores;
    }

    public void conquistarNovoSeguidor(Pirata pirata){
        if(pirata.getPoder() < this.getPoder()){
            this.numeroDeSeguidores++;
        } else {
            System.out.println("Não foi possivel conquistar " + pirata.getNome());
        }
    }

    public void darOrdens(){
        System.out.println("O capitao esta ordenando x tripulantes");
    }

    public void mudarRota(){
        System.out.println("O capitao esta mudando a rota");
    }
}
