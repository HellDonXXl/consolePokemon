
package pokemon;


import java.util.Random;



public class Player {
   
    String nome;
    int insigna;
    double vida = 100 ;
  public  int qtpokemon = 6;
  public int qtpokemonq = 5;

    public int getQtpokemon() {
        return qtpokemon;
    }



    public void setQtpokemon() {
        this.qtpokemon = qtpokemon - 1;
        if(qtpokemonq > 0 ){
        this.qtpokemonq = qtpokemonq -1 ;
        }
    }
    Pokemons[] pokemon = new Pokemons[6];

    public Pokemons[] getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemons[] pokemon) {
        this.pokemon = pokemon;
    }
    
    
   Player(String nome, int insigna )
   {
       this.nome = nome;
       this.insigna = insigna;
   } 

  


   public int getInsigna(){
    return insigna;
   }
   
   public double getvida(){
    return vida;
   }
   
   public String getnome(){
    return nome;
   }
   
   public void setInsigna(int insigna){
       this.insigna = insigna;
   }
   

   
    public void setvida(int vida){
       this.vida = vida;
   }
     public void danoVida(int vida){
       this.vida -= vida;
   }
    public void addPokemon(int x ,Pokemons pokemons)
    { 
      
           this.pokemon[x] = pokemons;  
    }
    
    public void danoNoPokemon(int index,double dano)
    {   
        Random random = new Random();
        int numero = random. nextInt(100);
        
        pokemon[index].life = pokemon[index].life   - (( dano*numero)/pokemon[index].life);
       
                
    }
}
