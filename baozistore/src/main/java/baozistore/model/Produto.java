package baozistore.model;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // nome do produto da loja baozi store
    private String nome;
    
    private BigDecimal preco;
    
    private Boolean estoque;

    public Produto() {}

    // gets e sets simples
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
    
    public BigDecimal getPreco() { 
        return preco; 
    }
    
    public void setPreco(BigDecimal preco) { 
        this.preco = preco; 
    }
    
    public Boolean getEstoque() { 
        return estoque; 
    }
    
    public void setEstoque(Boolean estoque) { 
        this.estoque = estoque; 
    }
}