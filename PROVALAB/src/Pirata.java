public class Pirata {
    private String nome;
    private String comidaFavorita;
    private int poder;

    public Pirata(String nome, String comidaFavorita, int poder) {
        this.nome = nome;
        this.comidaFavorita = comidaFavorita;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }

    public void comer(Cozinheiro cozinheiro, int index){
        System.out.print("Preparando: ");
        String prato = cozinheiro.prepararPrato(index);
        System.out.println(prato);

        this.poder++;
        if(prato == this.comidaFavorita)
            this.poder++;
    }

    public Pirata lutar(Pirata pirata){
        if(pirata.getPoder() > this.poder)
            return pirata;
        return this;
    }
}
