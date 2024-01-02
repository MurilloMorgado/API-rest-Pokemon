package pokemon.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pokemon.demo.model.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long>{
  
}
