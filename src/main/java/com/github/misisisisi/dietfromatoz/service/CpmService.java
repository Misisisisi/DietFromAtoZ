package com.github.misisisisi.dietfromatoz.service;

import org.springframework.stereotype.Service;

@Service
public class CpmService {

    double resultCPM;
    double resultPPM;
    double resultEndCPM;

    public double countPPM(String sex, double bodyWeight, int bodyHeight, int age) {
        if (sex.equals("kobieta")) {
            resultPPM = 655 + (9.6 * bodyWeight) + (1.8 * bodyHeight) - (4.7 * age);
        } else {
            resultPPM = 66 + (13.7 * bodyWeight) + (5 * bodyHeight) - (6.8 * age);
        }
        return resultPPM;
    }


    public double countCPM(String activity) {
        switch (activity) {
            case "brak":
                resultCPM = resultPPM * 1.2;
                break;
            case "mała":
                resultCPM = resultPPM * 1.4;
                break;
            case "średnia":
                resultCPM = resultPPM * 1.6;
                break;
            case "duża":
                resultCPM = resultPPM * 1.8;
                break;
        }
        return resultCPM;
    }

    public double countEndCPM(String aim) {
        switch (aim) {
            case "redukcja":
                resultEndCPM = resultCPM - 200;
                break;
            case "constans":
                resultEndCPM = resultCPM + 0;
                break;
            case "surplus":
                resultEndCPM = resultCPM + 300;
        }
        return resultEndCPM;
    }
}

