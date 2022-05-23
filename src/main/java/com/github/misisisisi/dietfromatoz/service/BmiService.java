package com.github.misisisisi.dietfromatoz.service;

import org.springframework.stereotype.Service;

@Service
public class BmiService {

    public double countBMI (double bodyWeight, double bodyHeight ) {
        double height = bodyHeight/100;
        return bodyWeight/(height*height);
    }
}
