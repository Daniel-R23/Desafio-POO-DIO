package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> consteudosConcluidos = new LinkedHashSet<>();

    public void inscrever(Bootcamp bootcamp){

    }

    public void progredir(){

    }

    public void calcularTotalXP(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConsteudosConcluidos() {
        return consteudosConcluidos;
    }

    public void setConsteudosConcluidos(Set<Conteudo> consteudosConcluidos) {
        this.consteudosConcluidos = consteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && conteudosInscritos.equals(dev.conteudosInscritos) && consteudosConcluidos.equals(dev.consteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, consteudosConcluidos);
    }
}
