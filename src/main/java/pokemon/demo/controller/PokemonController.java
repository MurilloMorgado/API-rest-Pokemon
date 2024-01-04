package pokemon.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pokemon.demo.model.Pokemon;
import pokemon.demo.service.PokemonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/pokemons")

public class PokemonController {

  private final PokemonService pokemonService;

  @GetMapping()
  public ResponseEntity<List<Pokemon>> listarPokemon() {
    List<Pokemon> listarPokemons = pokemonService.listarPokemon();
    return ResponseEntity.ok().body(listarPokemons);
  }

  @GetMapping(path = "/{idPokemon}")
  public ResponseEntity<Pokemon> buscarPokemon(@PathVariable Long idPokemon) {
    Pokemon pokemon = pokemonService.buscarPokemon(idPokemon);
    return ResponseEntity.ok().body(pokemon);
  }

  @PostMapping
  public ResponseEntity<Long> criarPokemon(@RequestBody Pokemon pokemon) {
    Long idPokemon = pokemonService.criarPokemon(pokemon).getId();
    return ResponseEntity.ok().body(idPokemon);
  }

  @PutMapping
  public ResponseEntity<Long> atualizarPokemon(Long idPokemon, Pokemon pokemon) {
    pokemonService.atualizarPokemon(idPokemon, pokemon);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping
  public ResponseEntity<Pokemon> deletarPokemon(Long idPokemon) {
    pokemonService.deletarPokemon(idPokemon);
    return ResponseEntity.ok().build();
  }

}
