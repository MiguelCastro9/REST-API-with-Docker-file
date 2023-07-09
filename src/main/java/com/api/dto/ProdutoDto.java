package com.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 *
 * @author Miguel Castro
 */
@Schema(name = "Produto")
public class ProdutoDto {
    
    private Long codigo_produto;
    
    private String nome_produto;
    
    private Double valor_produto;
    
    private Integer quantidade_produto;

    public Long getCodigo_produto() {
        return codigo_produto;
    }

    public void setCodigo_produto(Long codigo_produto) {
        this.codigo_produto = codigo_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public Double getValor_produto() {
        return valor_produto;
    }

    public void setValor_produto(Double valor_produto) {
        this.valor_produto = valor_produto;
    }

    public Integer getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(Integer quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    @Override
    public String toString() {
        return "ProdutoDto{" + "codigo_produto=" + codigo_produto + ", nome_produto=" + nome_produto + ", valor_produto=" + valor_produto + ", quantidade_produto=" + quantidade_produto + '}';
    }
}
