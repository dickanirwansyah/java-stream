/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dickaspring
 */
public class StreamFromList {
    
    public static void main(String[] args){
        
        //stream siswa
        List<String> nama_siswa = Arrays.asList("dicka", "doni", "subhan", 
                "ryan", "dicky", "ghani", "surti", "sonia", "toni", 
                "ali", "esta", "sentosa", "arif", "Hinata", "panji", "heni");
        
        int counter = (int) nama_siswa.stream()
                .map(String::toUpperCase)
                .filter(x -> x.startsWith("H"))
                .count();
        
        List<String> siswa_nama = Arrays.asList("dicka", "doni", "subhan", 
                "ryan", "dicky", "ghani", "surti", "sonia", "toni", 
                "ali", "esta", "sentosa", "arif", "Hinata", "panji", "heni");
        
        siswa_nama.stream()
                .map(String::toLowerCase)
                .filter(lambdaExpression -> lambdaExpression.startsWith("d"))
                .forEach(System.out::println);
        
        int counted = (int) siswa_nama.stream()
                .map(String::toLowerCase)
                .filter(lambda -> lambda.startsWith("g"))
                .count();
        
        
        //toUpperCase hanya menerima huruf kapital
        //toLowerCase hanya menerima huruf kecil
        
        System.out.println(counter +"\n" + counted);
    }
}
