package ghozti.pokemon.game;

import ghozti.pokemon.game.environment.GameStructure;
import ghozti.pokemon.game.environment.Shop;
import ghozti.pokemon.game.pokemon.Pokemon;
import ghozti.pokemon.game.user.User;

public class Game {
    public Game(){
        start();
    }

    private void start(){
        User.pokemons.add(new Pokemon("g",1,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon("g",1,1,1,1,"nsm","uw",true));
        User.pokemons.add(new Pokemon("g",1,1,1,1,"nsm","uw",true));

        GameStructure.checkPokemon();
    }
}
