/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author dickaspring
 */
public class StreamFilterNameBy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        //mencari nama dengan awalan b
        String[] nama_siswa = {
            "bobi",
            "beni",
            "dicka",
            "alif",
            "budi",
            "boni",
            "bento",
            "de",
            "sita",
            "eva"
        };
        Arrays.stream(nama_siswa)
                .filter(x -> x.startsWith("b"))
                .sorted()
                .forEach(System.out::println);
    }
    
}
