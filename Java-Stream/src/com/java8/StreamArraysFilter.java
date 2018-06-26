/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author dickaspring
 */
public class StreamArraysFilter {
 
    public static void main(String[] args){
        
        //nama akhiran a
        String[] namas = {"dicka", "de", "doni", "sabrina", "anggun", "eva", "evi", "nanda"};
        Arrays.stream(namas)
                .filter(x -> x.endsWith("a"))
                .sorted()
                .forEach(System.out::println);
        
        //nama awalan d
        String[] names = {"dicka", "de", "doni", "sabrina", "anggun", "eva", "evi", "nanda"};
        Arrays.stream(names)
                .filter(cariNama -> cariNama.startsWith("e"))
                .sorted()
                .forEach(System.out::println);
    }
}
