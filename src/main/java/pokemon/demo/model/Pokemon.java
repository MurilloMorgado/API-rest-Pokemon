package pokemon.demo.model;

import org.hibernate.annotations.ManyToAny;

// import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "POKEMON")
public class Pokemon {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID_POKEMON")
  private Long id;

  @Column(name = "NOME_POKEMON")
  private String nome;

  @Column(name = "NATUREZA_POKEMON")
  private String natureza;

  // @ManyToAny
  // @JoinColumn(name = "ID_TREINADOR")
  // private Treinador treinador;
}
