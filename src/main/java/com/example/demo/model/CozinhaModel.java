package com.example.demo.model;
import jakarta.persistence.*;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;

@Entity
@Table(name="tab_cozinha")
public class CozinhaModel{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    @Column(name="nome_cozinha", nullable= false)
    private String nome;


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    // public @Override boolean equals(){

    // }
    
    public @Override boolean equals(Object obj) {
        if(this==obj){
            CozinhaModel other = (CozinhaModel) obj;
            return this.id.equals(other.id);
        }
        return false;
    }

    public @Override int hashCode(){
        return id.hashCode();
    }
}
