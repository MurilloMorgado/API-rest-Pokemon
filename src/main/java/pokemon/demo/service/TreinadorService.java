package pokemon.demo.service;

import java.util.List;


import pokemon.demo.model.Treinador;

public interface TreinadorService {
  
  
  List<Treinador> listarTreinador();

  Treinador buscarTreinador(Long idTreinador);

  Treinador criarTreinador(Treinador treinador);

  void atualizarTreinador(Long idTreinador, Treinador treinador);

  void deletarTreinador(Long idTreinador);
  
}
