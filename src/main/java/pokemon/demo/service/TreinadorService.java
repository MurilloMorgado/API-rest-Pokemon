package pokemon.demo.service;

//Duvida, quando coloco list, vem esse import
// import org.hibernate.mapping.List;

import java.util.List;


import pokemon.demo.model.Treinador;

public interface TreinadorService {
  
  
  List<Treinador> listarTreinador();

  Treinador buscarTreinador(Long idTreinador);

  //tirar duvida sobre
  Treinador criarTreinador(Treinador treinador);

  void atualizarTreinador(Long idTreinador, Treinador treinador);

  void deletarTreinador(Long idTreinador);
  
}
