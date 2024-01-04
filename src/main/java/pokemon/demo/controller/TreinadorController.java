package pokemon.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import pokemon.demo.model.Treinador;
import pokemon.demo.service.TreinadorService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
@RestController
@RequestMapping("/treinador")

public class TreinadorController {

  private final TreinadorService treinadorService;

  @GetMapping()
  public ResponseEntity<List<Treinador>> listarTreinador() {
    List<Treinador> listarTreinador = treinadorService.listarTreinador();
    return ResponseEntity.ok().body(listarTreinador);
  }

  @GetMapping(path = "/treinador")
  public ResponseEntity<Treinador> buscarTreinador(@RequestParam Long idTreinado) {
    Treinador buscarTreinador = treinadorService.buscarTreinador(idTreinado);
    return ResponseEntity.ok().body(buscarTreinador);
  }

  @PostMapping()
  public ResponseEntity<Long> criarTreinador(@RequestBody Treinador treinador) {
    Long criarTreinador = treinadorService.criarTreinador(treinador).getId();
    return ResponseEntity.ok().body(criarTreinador);
  }

  @PutMapping(path = "/{idTreinador}")
  public ResponseEntity<Treinador> atualizarTreinador(Long idTreinador, Treinador treinador) {
    treinadorService.atualizarTreinador(idTreinador, treinador);
    return ResponseEntity.ok().build();
  }

  @DeleteMapping("/{idTreinador}")
  public ResponseEntity<Treinador> deletarTreinador(Long idTreinador){
    treinadorService.deletarTreinador(idTreinador);
    return ResponseEntity.ok().build();
  }
}
