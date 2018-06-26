/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8;

import java.util.stream.IntStream;

/**
 *
 * @author dickaspring
 */
public class StreamInstreamBasicly {
    
    public static void main(String[] args){
        
        IntStream
                .range(1, 5)
                .forEach(System.out::println);
        //outputnya --> 1,2,3,4 
    }
}
