package pokemon;

import java.util.Scanner;

public class Pokemon {

    public static void main(String[] args) {

        luta();

    }

    static void luta() {
        boolean turno = false;
        boolean fimDaLuta = false;

        Player player1;
        player1 = new Player("rafael", 0);
        Player player2;
        player2 = new Player("gabriel", 0);

        Pokemons pikachu = new Pokemons(14.0, 4.0, 2.0, 3.0, "Picachu", "raio do trovao", "investida", "refletir", "investida relapago", 5, 1, "normal");
        Pokemons x = new Pokemons(14.0, 4.0, 2.0, 3.0, "x", "raio do trovao", "investida", "refletir", "investida relapago", 5, 1, "normal");
        Pokemons y = new Pokemons(14.0, 4.0, 2.0, 3.0, "y", "raio do trovao", "investida", "refletir", "investida relapago", 5, 1, "normal");
        Pokemons z = new Pokemons(14.0, 4.0, 2.0, 3.0, "w", "raio do trovao", "investida", "refletir", "investida relapago", 5, 1, "normal");
        Pokemons a = new Pokemons(14.0, 4.0, 2.0, 3.0, "a", "raio do trovao", "investida", "refletir", "investida relapago", 5, 1, "normal");
        Pokemons q = new Pokemons(14.0, 4.0, 2.0, 3.0, "Pic", "raio do trovao", "investida", "refletir", "investida relapago", 5, 1, "normal");
        Pokemons g = new Pokemons(14.0, 4.0, 2.0, 3.0, "Pic", "raio do trovao", "investida", "refletir", "investida relapago", 100, 1, "normal");

        player1.addPokemon(0, pikachu);
        player1.addPokemon(1, x);
        player1.addPokemon(2, y);
        player1.addPokemon(3, z);
        player1.addPokemon(4, a);
        player1.addPokemon(5, q);

        player2.addPokemon(0, q);
        player2.addPokemon(1, pikachu);
        player2.addPokemon(2, y);
        player2.addPokemon(3, z);
        player2.addPokemon(4, a);
        player2.addPokemon(5, g);

        do {

            if (player1.getQtpokemon() == 0) {
                System.out.print("jogador 2 venceu");
                fimDaLuta = true;
                break;

            }

            if (player2.getQtpokemon() == 0) {
                System.out.print("jogador 1 venceu");
                fimDaLuta = true;
                break;
            }
            Scanner teclado = new Scanner(System.in);

            if (turno == false) {
                if (player1.pokemon[player1.qtpokemonq].life <= 0.0) {
                    player1.setQtpokemon();

                }

                if (player1.qtpokemon != 0) {
                    System.out.printf("Nome: %s \n Insigina: %d \n Vida: %b \n Numero de Pokemons: %d %n ", player1.getnome(), player1.insigna, player1.vida, player1.getQtpokemon());
                    System.out.printf("NomeDoPokemon: %s  ||   Tipo: %s ||   Vida: %.0f || Nivel: %d ||   %n 0 - Poder: %s  Dano: %.0f  %n 1- Poder: %s Dano: %.0f %n 2 -Poder:%s  Dano:%.0f %n 3-Poder:%s  Dano:%.0f %n ",
                            player1.pokemon[player1.qtpokemonq].nome,
                            player1.pokemon[player1.qtpokemonq].tipos,
                            player1.pokemon[player1.qtpokemonq].life,
                            player1.pokemon[player1.qtpokemonq].nivel,
                            player1.pokemon[player1.qtpokemonq].poder[0],
                            player1.pokemon[player1.qtpokemonq].dano[0],
                            player1.pokemon[player1.qtpokemonq].poder[1],
                            player1.pokemon[player1.qtpokemonq].dano[1],
                            player1.pokemon[player1.qtpokemonq].poder[2],
                            player1.pokemon[player1.qtpokemonq].dano[2],
                            player1.pokemon[player1.qtpokemonq].poder[3],
                            player1.pokemon[player1.qtpokemonq].dano[3]
                    );

                    int seletion;

                    System.out.print("Selecione o seu ataque pelo número dele: ");
                    seletion = Integer.parseInt(teclado.nextLine());

                    if (seletion >= 0 || seletion <= 3) {
                        player2.danoNoPokemon(player2.qtpokemonq, player1.pokemon[player1.qtpokemonq].dano[seletion]);
                    }
                } else {
                    turno = true;
                }

                if (player2.getQtpokemon() == 0) {
                    System.out.print("jogador 1 venceu");
                    fimDaLuta = true;
                }
                if (player1.getQtpokemon() == 0) {
                    System.out.print("jogador 2 venceu");
                    fimDaLuta = true;
                }

                turno = true;

            } else {
                if (player2.pokemon[player2.qtpokemonq].life <= 0.0) {
                    player2.setQtpokemon();

                }
                if (player2.getQtpokemon() == 0) {
                    System.out.print("jogador 1 venceu");
                    fimDaLuta = true;
                    break;
                }
                if (player1.getQtpokemon() == 0) {

                    System.out.print("jogador 2 venceu");
                    fimDaLuta = true;
                    break;
                }

                if (player2.pokemon[player2.qtpokemonq].life <= 0.0) {
                    player2.setQtpokemon();

                }
                if (player2.getQtpokemon() != 0) {
                    System.out.printf("Nome: %s \n Insigina: %d \n Vida: %b \n Pokemons: %d ", player2.getnome(), player2.insigna, player2.vida, player2.getQtpokemon());
                    System.out.printf("NomeDoPokemon: %s  ||   Tipo: %s ||   Vida: %.0f || Nivel: %d ||   %n 0 - Poder: %s  Dano: %.0f  %n 1- Poder: %s Dano: %.0f %n 2 -Poder:%s  Dano:%.0f %n 3-Poder:%s  Dano:%.0f %n  ",
                            player2.pokemon[player2.qtpokemonq].nome,
                            player2.pokemon[player2.qtpokemonq].tipos,
                            player2.pokemon[player2.qtpokemonq].life,
                            player2.pokemon[player2.qtpokemonq].nivel,
                            player2.pokemon[player2.qtpokemonq].poder[0],
                            player2.pokemon[player2.qtpokemonq].dano[0],
                            player2.pokemon[player2.qtpokemonq].poder[1],
                            player2.pokemon[player2.qtpokemonq].dano[1],
                            player2.pokemon[player2.qtpokemonq].poder[2],
                            player2.pokemon[player2.qtpokemonq].dano[2],
                            player2.pokemon[player2.qtpokemonq].poder[3],
                            player2.pokemon[player2.qtpokemonq].dano[3]);

                    int seletion;

                    System.out.print("Selecione o seu ataque pelo número dele: ");
                    seletion = Integer.parseInt(teclado.nextLine());

                    if (seletion >= 0 || seletion <= 3) {
                        player1.danoNoPokemon(player1.qtpokemonq, player2.pokemon[player2.qtpokemonq].dano[seletion]);
                    }
                } else {
                    turno = false;
                }

                if (player1.getQtpokemon() <= 0) {
                    fimDaLuta = true;
                    break;
                }
                turno = false;
            }

        } while (fimDaLuta == false);
 
    }
}
