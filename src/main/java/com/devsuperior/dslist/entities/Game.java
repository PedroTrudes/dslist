package com.devsuperior.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

//Arquivo entitie precisa estar dentro do pacote principal, se estiver fora ele não roda automaticamente
@Entity //vai configurar a classe java para que seja equivalente a uma tabela
@Table(name = "tb_game")
public class Game {
    @Id //informando que esse dado é o id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //informando que esse valor vai ser criado automaticamente
    private Long id;
    private String title;
    @Column(name = "gameYear") //mudando o nome no banco de dados para não dar problema na criação
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game(){

    }
    //o id que vem como parametro é a mesma coisa dos atributos do GAME this.id = atributos --- id é igual ao que vem do metodo
    public Game(Long id, String title, String genre, Integer year, String platforms, Double score, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    //Usado para poder comparar um objeto com outro
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(getId(), game.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
