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
public class StreamIntstreamWithSkip {
    
    public static void main(String[] args){
        
        IntStream.range(1, 10)
                .skip(5)
                .forEach(System.out::println);
        
        //normalnya lambda seperti ini
//        IntStream.range(1, 10)
//                .skip(5)
//                .forEach((x) -> System.out.println(x));
    }
}
