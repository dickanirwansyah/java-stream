/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8;

import java.util.stream.Stream;

/**
 *
 * @author dickaspring
 */
public class StreamSortedFindAndFirst {
    
    public static void main(String[] args){
        Stream.of("dicka", "de", "ali", "abi", "anggun", "abc", "luthfi")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        
        //sorted and findFirst --> mencari nama dengan huruf paling abjad
    }
}
