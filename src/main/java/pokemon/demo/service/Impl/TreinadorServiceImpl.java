package pokemon.demo.service.Impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import pokemon.demo.model.Treinador;
import pokemon.demo.model.exceotion.InternalServerException;
import pokemon.demo.model.exceotion.NotFoundException;
import pokemon.demo.repository.TreinadorRespository;
import pokemon.demo.service.TreinadorService;

@Service
@RequiredArgsConstructor

public class TreinadorServiceImpl implements TreinadorService {

  private final TreinadorRespository treinadorRespository;

  @Override
  public List<Treinador> listarTreinador() {
    return treinadorRespository.findAll();
  }

  @Override
  public Treinador buscarTreinador(Long idTreinador) {
    return treinadorRespository.findById(idTreinador).orElseThrow(() -> new NotFoundException("Falha ao procurar o Treinador"));
  }

  @Override
  public Treinador criarTreinador(Treinador treinador) {
    try {
      return treinadorRespository.save(treinador);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao criar Treinador");
    }
  }

  @Override
  public void atualizarTreinador(Long idTreinador, Treinador treinador) {
    try {
      Treinador treinadorDB = buscarTreinador(idTreinador);

      BeanUtils.copyProperties(treinador, treinadorDB);

      treinadorRespository.save(treinadorDB);
    } catch (Exception e) {
      throw new InternalServerException("Falha ao atualizar o Treinador");
    }
  }

  @Override
  public void deletarTreinador(Long idTreinador) {
try {
  Treinador treinadorDB = buscarTreinador(idTreinador);

  treinadorRespository.delete(treinadorDB);
} catch (Exception e) {
  throw new InternalServerException("Falha ao deletar o Treinador");
}
  }
  
}
