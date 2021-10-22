package com.backend.aula06.service;

public class SerieServiceService implements ISerieService {
    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {
        String link = "www." + nome + ".com.br";
        return link;
    }
}
