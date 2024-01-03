package pokemon.demo.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pokemon.demo.model.Pokemon;
import pokemon.demo.repository.PokemonRepository;
import pokemon.demo.service.PokemonService;

@Service
@RequiredArgsConstructor

public class PokemonServiceImpl implements PokemonService {

  @Override
  public List<Pokemon> listarPokemon() {
    // return PokemonRepository.findAll();
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarPokemon'");
  }

  @Override
  public Pokemon buscarPokemon(Long idPokemon) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarPokemon'");
  }

  @Override
  public Pokemon criarPokemon(Pokemon pokemon) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'criarPokemon'");
  }

  @Override
  public void atualizarPokemon(Long idPokemon, Pokemon pokemon) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'atualizarPokemon'");
  }

  @Override
  public void deletarPokemon(Long idPokemon) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletarPokemon'");
  }
  
}
