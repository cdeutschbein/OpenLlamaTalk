/*
 * Conditional.java
 *
 * Probabilities for Sentence Breaks
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

package com.openllamatalk.helloglass;

public class PosCond {

  public List<Integer> sentenceBreaks(String[] all_pos) {
    int prevalenceRate = 0.098834;
    int arrLen = all_pos.length
    int tar = (int)(prevalenceRate * (double)arrLen)); /* maybe this should turn into len/10 */
    int curr = 0;
    double criticalValue = prevalenceRate;
    List<Double> posConds = mappedPosCond(all_pos);
    List<toSort> toSort = new ArrayList<Double>(posConds);
    Collections.sort(toSort);
    Collections.reverse(toSort);
    double pivot = toSort.get(tar);
    List<Integer> retValues = new ArrayList<Integer>();
    for (int i = 0; i < arrLen; i++) {
      double e = list.get(i);
      if (e >= pivot) {
        retValues.add(i);
      }
    }
    return retValues;
  }
    

  List<Double> mappedPosCond(String[] all_pos) {
    int i;
    List<Double> posConds = new ArrayList<Double>();
    for (i = 0; i < (all_pos.length - 1); i++) {
      list.add(posCond(all_pos[i], all_pos[i+1]);
    }
    return posConds;
  }

  double posCond(String posBefore, String posAfter) {
    if (posBefore.equals("PERIOD"))
      else
        return 0.0;
    else if (posBefore.equals("UH"))
      else
        return 0.0;
    else if (posBefore.equals("VB"))
      else if (posAfter.equals("DT"))
        return 0.029240;
      else if (posAfter.equals("RB"))
        return 0.020408;
      else if (posAfter.equals("JJ"))
        return 0.032787;
      else if (posAfter.equals("NN"))
        return 0.061224;
      else if (posAfter.equals("PRP"))
        return 0.077465;
      else if (posAfter.equals("VBP"))
        return 0.400000;
      else if (posAfter.equals("NNP"))
        return 0.285714;
      else if (posAfter.equals("IN"))
        return 0.050633;
      else if (posAfter.equals("CC"))
        return 0.100000;
      else if (posAfter.equals("NNS"))
        return 0.038462;
      else if (posAfter.equals("WP"))
        return 0.142857;
      else if (posAfter.equals("MD"))
        return 0.500000;
      else if (posAfter.equals("WDT"))
        return 0.500000;
      else
        return 0.0;
    else if (posBefore.equals("DT"))
      else if (posAfter.equals("VB"))
        return 0.142857;
      else if (posAfter.equals("DT"))
        return 0.312500;
      else if (posAfter.equals("PRP"))
        return 0.200000;
      else if (posAfter.equals("NNS"))
        return 0.006494;
      else if (posAfter.equals("EX"))
        return 0.500000;
      else if (posAfter.equals("WRB"))
        return 0.500000;
      else if (posAfter.equals("CD"))
        return 0.076923;
      else
        return 0.0;
    else if (posBefore.equals("VBZ"))
      else if (posAfter.equals("VB"))
        return 0.500000;
      else if (posAfter.equals("DT"))
        return 0.022901;
      else if (posAfter.equals("PRP"))
        return 0.041667;
      else if (posAfter.equals("VBP"))
        return 1.000000;
      else if (posAfter.equals("NNP"))
        return 0.250000;
      else if (posAfter.equals("PRP$"))
        return 0.050000;
      else
        return 0.0;
    else if (posBefore.equals("RB"))
      else if (posAfter.equals("UH"))
        return 0.500000;
      else if (posAfter.equals("VB"))
        return 0.046154;
      else if (posAfter.equals("DT"))
        return 0.225490;
      else if (posAfter.equals("VBZ"))
        return 0.033333;
      else if (posAfter.equals("RB"))
        return 0.083333;
      else if (posAfter.equals("JJ"))
        return 0.007874;
      else if (posAfter.equals("NN"))
        return 0.153846;
      else if (posAfter.equals("PRP"))
        return 0.299065;
      else if (posAfter.equals("VBP"))
        return 0.081081;
      else if (posAfter.equals("VBN"))
        return 0.017544;
      else if (posAfter.equals("NNP"))
        return 0.666667;
      else if (posAfter.equals("IN"))
        return 0.097345;
      else if (posAfter.equals("CC"))
        return 0.233333;
      else if (posAfter.equals("TO"))
        return 0.038462;
      else if (posAfter.equals("NNS"))
        return 0.210526;
      else if (posAfter.equals("EX"))
        return 0.200000;
      else if (posAfter.equals("WP"))
        return 0.666667;
      else if (posAfter.equals("PRP$"))
        return 0.437500;
      else if (posAfter.equals("WRB"))
        return 0.200000;
      else if (posAfter.equals("CD"))
        return 0.200000;
      else if (posAfter.equals("MD"))
        return 0.083333;
      else
        return 0.0;
    else if (posBefore.equals("JJ"))
      else if (posAfter.equals("UH"))
        return 1.000000;
      else if (posAfter.equals("VB"))
        return 0.800000;
      else if (posAfter.equals("DT"))
        return 0.415094;
      else if (posAfter.equals("VBZ"))
        return 0.125000;
      else if (posAfter.equals("RB"))
        return 0.300000;
      else if (posAfter.equals("JJ"))
        return 0.098592;
      else if (posAfter.equals("NN"))
        return 0.007496;
      else if (posAfter.equals("PRP"))
        return 0.650000;
      else if (posAfter.equals("VBP"))
        return 0.166667;
      else if (posAfter.equals("NNP"))
        return 0.600000;
      else if (posAfter.equals("IN"))
        return 0.091837;
      else if (posAfter.equals("CC"))
        return 0.060000;
      else if (posAfter.equals("TO"))
        return 0.027027;
      else if (posAfter.equals("VBD"))
        return 0.142857;
      else if (posAfter.equals("NNS"))
        return 0.023569;
      else if (posAfter.equals("EX"))
        return 0.714286;
      else if (posAfter.equals("WP"))
        return 1.000000;
      else if (posAfter.equals("PRP$"))
        return 0.500000;
      else if (posAfter.equals("WRB"))
        return 0.250000;
      else if (posAfter.equals("JJS"))
        return 1.000000;
      else if (posAfter.equals("CD"))
        return 0.428571;
      else if (posAfter.equals("MD"))
        return 0.500000;
      else if (posAfter.equals("WDT"))
        return 1.000000;
      else
        return 0.0;
    else if (posBefore.equals("NN"))
      else if (posAfter.equals("UH"))
        return 1.000000;
      else if (posAfter.equals("VB"))
        return 0.564103;
      else if (posAfter.equals("DT"))
        return 0.732000;
      else if (posAfter.equals("VBZ"))
        return 0.016807;
      else if (posAfter.equals("RB"))
        return 0.317073;
      else if (posAfter.equals("JJ"))
        return 0.456140;
      else if (posAfter.equals("NN"))
        return 0.099099;
      else if (posAfter.equals("PRP"))
        return 0.615063;
      else if (posAfter.equals("VBP"))
        return 0.219512;
      else if (posAfter.equals("VBN"))
        return 0.100000;
      else if (posAfter.equals("NNP"))
        return 0.812500;
      else if (posAfter.equals("IN"))
        return 0.067890;
      else if (posAfter.equals("CC"))
        return 0.130435;
      else if (posAfter.equals("TO"))
        return 0.126761;
      else if (posAfter.equals("VBD"))
        return 0.011858;
      else if (posAfter.equals("NNS"))
        return 0.146199;
      else if (posAfter.equals("EX"))
        return 0.666667;
      else if (posAfter.equals("VBG"))
        return 0.500000;
      else if (posAfter.equals("WP"))
        return 0.562500;
      else if (posAfter.equals("PRP$"))
        return 0.675676;
      else if (posAfter.equals("WRB"))
        return 0.625000;
      else if (posAfter.equals("JJS"))
        return 1.000000;
      else if (posAfter.equals("CD"))
        return 0.615385;
      else if (posAfter.equals("MD"))
        return 0.069767;
      else if (posAfter.equals("WDT"))
        return 0.142857;
      else if (posAfter.equals("RBR"))
        return 0.500000;
      else if (posAfter.equals("PDT"))
        return 1.000000;
      else
        return 0.0;
    else if (posBefore.equals("PRP"))
      else if (posAfter.equals("UH"))
        return 1.000000;
      else if (posAfter.equals("VB"))
        return 0.040541;
      else if (posAfter.equals("DT"))
        return 0.263158;
      else if (posAfter.equals("VBZ"))
        return 0.011628;
      else if (posAfter.equals("RB"))
        return 0.092784;
      else if (posAfter.equals("JJ"))
        return 0.176471;
      else if (posAfter.equals("NN"))
        return 0.125000;
      else if (posAfter.equals("PRP"))
        return 0.600000;
      else if (posAfter.equals("VBP"))
        return 0.007576;
      else if (posAfter.equals("NNP"))
        return 0.666667;
      else if (posAfter.equals("IN"))
        return 0.127660;
      else if (posAfter.equals("CC"))
        return 0.181818;
      else if (posAfter.equals("VBD"))
        return 0.008721;
      else if (posAfter.equals("EX"))
        return 0.333333;
      else if (posAfter.equals("WP"))
        return 0.250000;
      else if (posAfter.equals("PRP$"))
        return 0.300000;
      else if (posAfter.equals("WRB"))
        return 0.428571;
      else if (posAfter.equals("CD"))
        return 0.666667;
      else if (posAfter.equals("MD"))
        return 0.008065;
      else
        return 0.0;
    else if (posBefore.equals("VBP"))
      else if (posAfter.equals("VB"))
        return 0.500000;
      else if (posAfter.equals("DT"))
        return 0.057692;
      else if (posAfter.equals("RB"))
        return 0.012658;
      else if (posAfter.equals("JJ"))
        return 0.037736;
      else if (posAfter.equals("NN"))
        return 0.033333;
      else if (posAfter.equals("PRP"))
        return 0.017857;
      else if (posAfter.equals("NNP"))
        return 0.666667;
      else if (posAfter.equals("IN"))
        return 0.034483;
      else
        return 0.0;
    else if (posBefore.equals("VBN"))
      else if (posAfter.equals("VB"))
        return 0.400000;
      else if (posAfter.equals("DT"))
        return 0.285714;
      else if (posAfter.equals("RB"))
        return 0.241379;
      else if (posAfter.equals("JJ"))
        return 0.105263;
      else if (posAfter.equals("NN"))
        return 0.172414;
      else if (posAfter.equals("PRP"))
        return 0.666667;
      else if (posAfter.equals("VBP"))
        return 0.500000;
      else if (posAfter.equals("NNP"))
        return 0.900000;
      else if (posAfter.equals("IN"))
        return 0.052288;
      else if (posAfter.equals("CC"))
        return 0.181818;
      else if (posAfter.equals("VBD"))
        return 0.666667;
      else if (posAfter.equals("NNS"))
        return 0.071429;
      else if (posAfter.equals("EX"))
        return 1.000000;
      else if (posAfter.equals("VBG"))
        return 0.333333;
      else if (posAfter.equals("WP"))
        return 1.000000;
      else if (posAfter.equals("PRP$"))
        return 0.307692;
      else if (posAfter.equals("WRB"))
        return 0.333333;
      else if (posAfter.equals("WDT"))
        return 1.000000;
      else
        return 0.0;
    else if (posBefore.equals("NNP"))
      else if (posAfter.equals("VB"))
        return 0.250000;
      else if (posAfter.equals("DT"))
        return 0.176471;
      else if (posAfter.equals("VBZ"))
        return 0.038462;
      else if (posAfter.equals("JJ"))
        return 0.166667;
      else if (posAfter.equals("PRP"))
        return 0.181818;
      else if (posAfter.equals("NNP"))
        return 0.176471;
      else if (posAfter.equals("IN"))
        return 0.125000;
      else if (posAfter.equals("PRP$"))
        return 0.200000;
      else if (posAfter.equals("WRB"))
        return 0.333333;
      else
        return 0.0;
    else if (posBefore.equals("IN"))
      else if (posAfter.equals("VB"))
        return 0.500000;
      else if (posAfter.equals("DT"))
        return 0.007561;
      else if (posAfter.equals("RB"))
        return 0.057143;
      else if (posAfter.equals("NN"))
        return 0.003322;
      else if (posAfter.equals("PRP"))
        return 0.006173;
      else if (posAfter.equals("IN"))
        return 0.025641;
      else if (posAfter.equals("PRP$"))
        return 0.008929;
      else if (posAfter.equals("WRB"))
        return 0.500000;
      else
        return 0.0;
    else if (posBefore.equals("CC"))
      else
        return 0.0;
    else if (posBefore.equals("TO"))
      else
        return 0.0;
    else if (posBefore.equals("VBD"))
      else if (posAfter.equals("UH"))
        return 1.000000;
      else if (posAfter.equals("VB"))
        return 0.250000;
      else if (posAfter.equals("DT"))
        return 0.014706;
      else if (posAfter.equals("RB"))
        return 0.022727;
      else if (posAfter.equals("JJ"))
        return 0.014493;
      else if (posAfter.equals("NN"))
        return 0.021277;
      else if (posAfter.equals("PRP"))
        return 0.080808;
      else if (posAfter.equals("VBP"))
        return 1.000000;
      else if (posAfter.equals("NNP"))
        return 0.333333;
      else if (posAfter.equals("IN"))
        return 0.008130;
      else if (posAfter.equals("VBD"))
        return 0.250000;
      else if (posAfter.equals("NNS"))
        return 0.055556;
      else if (posAfter.equals("EX"))
        return 0.750000;
      else if (posAfter.equals("CD"))
        return 0.100000;
      else
        return 0.0;
    else if (posBefore.equals("WP$"))
      else
        return 0.0;
    else if (posBefore.equals("NNS"))
      else if (posAfter.equals("UH"))
        return 0.666667;
      else if (posAfter.equals("VB"))
        return 0.406250;
      else if (posAfter.equals("DT"))
        return 0.721154;
      else if (posAfter.equals("VBZ"))
        return 0.076923;
      else if (posAfter.equals("RB"))
        return 0.263158;
      else if (posAfter.equals("JJ"))
        return 0.465116;
      else if (posAfter.equals("NN"))
        return 0.366667;
      else if (posAfter.equals("PRP"))
        return 0.676923;
      else if (posAfter.equals("VBP"))
        return 0.030075;
      else if (posAfter.equals("NNP"))
        return 0.833333;
      else if (posAfter.equals("IN"))
        return 0.101010;
      else if (posAfter.equals("CC"))
        return 0.111111;
      else if (posAfter.equals("VBD"))
        return 0.028302;
      else if (posAfter.equals("NNS"))
        return 0.454545;
      else if (posAfter.equals("EX"))
        return 0.500000;
      else if (posAfter.equals("VBG"))
        return 0.200000;
      else if (posAfter.equals("WP"))
        return 0.600000;
      else if (posAfter.equals("PRP$"))
        return 0.615385;
      else if (posAfter.equals("WRB"))
        return 0.750000;
      else if (posAfter.equals("JJS"))
        return 0.500000;
      else if (posAfter.equals("CD"))
        return 0.555556;
      else if (posAfter.equals("MD"))
        return 0.083333;
      else if (posAfter.equals("RBR"))
        return 0.750000;
      else
        return 0.0;
    else if (posBefore.equals("JJR"))
      else if (posAfter.equals("VB"))
        return 1.000000;
      else if (posAfter.equals("RB"))
        return 0.666667;
      else if (posAfter.equals("IN"))
        return 0.083333;
      else if (posAfter.equals("CC"))
        return 0.250000;
      else if (posAfter.equals("PRP$"))
        return 1.000000;
      else
        return 0.0;
    else if (posBefore.equals("EX"))
      else
        return 0.0;
    else if (posBefore.equals("VBG"))
      else if (posAfter.equals("DT"))
        return 0.071429;
      else if (posAfter.equals("NNP"))
        return 0.666667;
      else if (posAfter.equals("IN"))
        return 0.064516;
      else if (posAfter.equals("NNS"))
        return 0.047619;
      else if (posAfter.equals("PRP$"))
        return 0.100000;
      else if (posAfter.equals("WRB"))
        return 1.000000;
      else
        return 0.0;
    else if (posBefore.equals("WP"))
      else if (posAfter.equals("NN"))
        return 0.500000;
      else if (posAfter.equals("PRP$"))
        return 1.000000;
      else
        return 0.0;
    else if (posBefore.equals("PRP$"))
      else
        return 0.0;
    else if (posBefore.equals("WRB"))
      else if (posAfter.equals("PRP"))
        return 0.040000;
      else
        return 0.0;
    else if (posBefore.equals("JJS"))
      else
        return 0.0;
    else if (posBefore.equals("CD"))
      else if (posAfter.equals("VB"))
        return 1.000000;
      else if (posAfter.equals("DT"))
        return 0.500000;
      else if (posAfter.equals("RB"))
        return 0.500000;
      else if (posAfter.equals("PRP"))
        return 0.333333;
      else if (posAfter.equals("VBN"))
        return 1.000000;
      else if (posAfter.equals("NNS"))
        return 0.024390;
      else if (posAfter.equals("RBS"))
        return 1.000000;
      else
        return 0.0;
    else if (posBefore.equals("MD"))
      else if (posAfter.equals("PRP"))
        return 0.052632;
      else if (posAfter.equals("IN"))
        return 1.000000;
      else
        return 0.0;
    else if (posBefore.equals("POS"))
      else if (posAfter.equals("PRP"))
        return 1.000000;
      else
        return 0.0;
    else if (posBefore.equals("WDT"))
      else
        return 0.0;
    else if (posBefore.equals("WP$"))
      else
        return 0.0;
    else if (posBefore.equals("RP"))
      else if (posAfter.equals("VB"))
        return 0.500000;
      else if (posAfter.equals("DT"))
        return 0.111111;
      else if (posAfter.equals("VBZ"))
        return 1.000000;
      else if (posAfter.equals("JJ"))
        return 0.400000;
      else if (posAfter.equals("NN"))
        return 0.333333;
      else if (posAfter.equals("NNP"))
        return 1.000000;
      else if (posAfter.equals("IN"))
        return 0.041667;
      else if (posAfter.equals("WP"))
        return 1.000000;
      else if (posAfter.equals("WRB"))
        return 0.500000;
      else
        return 0.0;
    else if (posBefore.equals("RBR"))
      else if (posAfter.equals("RB"))
        return 0.250000;
      else if (posAfter.equals("NNP"))
        return 1.000000;
      else if (posAfter.equals("IN"))
        return 0.166667;
      else
        return 0.0;
    else if (posBefore.equals("PDT"))
      else
        return 0.0;
    else if (posBefore.equals("RBS"))
      else if (posAfter.equals("RB"))
        return 0.333333;
      else
        return 0.0;
    else if (posBefore.equals("FW"))
      else
        return 0.0;
    else if (posBefore.equals("NNPS"))
      else
        return 0.0;
 }

}