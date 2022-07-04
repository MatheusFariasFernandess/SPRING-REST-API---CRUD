package com.example.demo.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
public class RestauranteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    @Column(name="nome",length = 10,nullable = false)
    private String nome;

    @Column(name="taxa_frete",nullable = false)
    private BigDecimal taxaFrete;



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

    /**
     * @return BigDecimal return the taxaFrete
     */
    public BigDecimal getTaxaFrete() {
        return taxaFrete;
    }

    /**
     * @param taxaFrete the taxaFrete to set
     */
    public void setTaxaFrete(BigDecimal taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

}
