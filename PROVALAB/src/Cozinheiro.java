import java.util.ArrayList;

public class Cozinheiro extends Pirata{
    private ArrayList<Receita> livroDeReceitas = new ArrayList<>();

    public ArrayList<Receita> getLivroDeReceitas() {
        return livroDeReceitas;
    }

    public void setLivroDeReceitas(ArrayList<Receita> livroDeReceitas) {
        this.livroDeReceitas = livroDeReceitas;
    }

    public Cozinheiro(String nome, String comidaFavorita, int poder) {
        super(nome, comidaFavorita, poder);
    }

    public String prepararPrato(int index){
        return this.livroDeReceitas.get(index).getNome();
    }

    public void mostrarReceitas(){
        for(Receita receita : this.livroDeReceitas){
            if(receita != null)
                System.out.println(receita.toString());
        }
    }
}
