package com.devsuperior.dslist.projections;
//vamos colocar metodos GET correspondentes a minha busca no GameRepository
public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShort_description();
    Integer getPosition();



}
