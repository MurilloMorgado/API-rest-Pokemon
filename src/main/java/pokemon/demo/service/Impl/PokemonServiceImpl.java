package pokemon.demo.service.Impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import pokemon.demo.model.Pokemon;
import pokemon.demo.model.exceotion.InternalServerException;
import pokemon.demo.model.exceotion.NotFoundException;
import pokemon.demo.repository.PokemonRepository;
import pokemon.demo.service.PokemonService;

@Service
@RequiredArgsConstructor

public class PokemonServiceImpl implements PokemonService {

  private final PokemonRepository pokemonRepository;

  @Override
  public List<Pokemon> listarPokemon() {
    return pokemonRepository.findAll();
  }

  @Override
  public Pokemon buscarPokemon(Long idPokemon) {
    return pokemonRepository.findById(idPokemon).orElseThrow(() -> new NotFoundException("Falha ao procurar o Pokemon"));
  }

  @Override
  public Pokemon criarPokemon(Pokemon pokemon) {
    try {
      return pokemonRepository.save(pokemon);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao procurar o Pokemon");
    }
  }

  @Override
  @Transactional
  public void atualizarPokemon(Long idPokemon, Pokemon pokemon) {
    try {
      Pokemon pokemonDB = buscarPokemon(idPokemon);

      BeanUtils.copyProperties(pokemon, pokemonDB);

      pokemonRepository.save(pokemonDB);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao atualizar o Pokemon");
    }
  }

  @Override
  @Transactional
  public void deletarPokemon(Long idPokemon) {
    try {
        Pokemon pokemonDB = buscarPokemon(idPokemon);

        pokemonRepository.delete(pokemonDB);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao atualizar o Pokemon");
    }
  }
  
}
