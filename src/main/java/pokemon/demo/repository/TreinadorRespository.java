package pokemon.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pokemon.demo.model.Treinador;

public interface TreinadorRespository extends JpaRepository<Treinador, Long>{
  
}
