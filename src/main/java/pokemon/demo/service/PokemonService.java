package pokemon.demo.service;

import java.util.List;

import pokemon.demo.model.Pokemon;

public interface PokemonService {
  

  List<Pokemon> listarPokemon();

  Pokemon buscarPokemon(Long idPokemon);

  Pokemon criarPokemon(Pokemon pokemon);

  void atualizarPokemon(Long idPokemon, Pokemon pokemon);

  void deletarPokemon(Long idPokemon);

}
