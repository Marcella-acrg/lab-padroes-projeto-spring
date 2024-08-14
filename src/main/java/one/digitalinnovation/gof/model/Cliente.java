package one.digitalinnovation.gof.model;

import jakarta.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne //O endereco pode ser o mesmo para multiplos clientes, mas um cliente só terá um endereco.
    private Endereco Endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public one.digitalinnovation.gof.model.Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(one.digitalinnovation.gof.model.Endereco endereco) {
        Endereco = endereco;
    }
}
