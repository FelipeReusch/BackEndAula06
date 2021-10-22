package com.backend.aula06.service;

public class SerieServiceProxy implements ISerieService {
    private int qtdViews;
    private SerieServiceService serieService = new SerieServiceService();

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadaException {
        if (qtdViews < 5) {
            qtdViews ++;
            System.out.println(qtdViews);
            return serieService.getSerie(nome);
        } else {
            throw new SerieNaoHabilitadaException("Excede o numero de reproducoes");
        }
    }

}