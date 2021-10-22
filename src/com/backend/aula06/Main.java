package com.backend.aula06;

import com.backend.aula06.service.SerieNaoHabilitadaException;
import com.backend.aula06.service.SerieServiceProxy;
import com.backend.aula06.service.SerieServiceService;

public class Main {

    public static void main(String[] args) throws SerieNaoHabilitadaException {
        SerieServiceProxy serie = new SerieServiceProxy();
        serie.getSerie("serie01");
        serie.getSerie("serie02");
        serie.getSerie("serie03");
        serie.getSerie("serie04");
        serie.getSerie("serie05");
        serie.getSerie("serie06");

    }
}
