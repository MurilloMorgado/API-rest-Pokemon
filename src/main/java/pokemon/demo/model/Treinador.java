package pokemon.demo.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "TREINADOR")
public class Treinador {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_TREINADOR")
  private Long id;

  @Column(name = "NOME_TREINADOR")
  private String nomeTreinador;

  @Column(name = "IDADE_TREINADOR")
  private Integer idadeTreinador;

  @Column(name = "CIDADE_TREINADOR")
  private String cidadeTreinador;
}
