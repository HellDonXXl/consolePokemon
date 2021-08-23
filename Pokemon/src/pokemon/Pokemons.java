package pokemon;

public class Pokemons {

    double [] dano = new double [4];
    String nome;
    String[] poder = new String[4];
    double life;
    int nivel;
    String tipos;

    Pokemons(double dano,double dano1,double dano2,double dano3, String nome, String poder, String poder1, String poder2, String poder3, double life, int nivel, String elemento) {
        this.dano[0] = dano;
        this.dano[1] = dano1;
        this.dano[2] = dano2;
        this.dano[3] = dano3;
        this.nome = nome;
        this.poder[0] = poder;
        this.poder[1] = poder1;
        this.poder[2] = poder2;
        this.poder[3] = poder3;
        this.life = life;
        this.nivel = nivel;

        switch (elemento) {
            case "agua":
                this.tipos = tipo.agua.toString();
                break;
            case "ar":
                this.tipos = tipo.ar.toString();
                break;
            case "fogo":
                this.tipos = tipo.fogo.toString();
                break;
            case "terra":
                this.tipos = tipo.terra.toString();
                break;
            case "veneno":
                this.tipos = tipo.veneno.toString();
                break;
            case "voador":
                this.tipos = tipo.voador.toString();
                break;
            default:
                this.tipos = tipo.normal.toString();
                break;
        }

    }
    
    
}
