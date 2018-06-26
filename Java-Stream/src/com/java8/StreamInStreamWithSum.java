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
public class StreamInStreamWithSum {
    
    public static void main(String[] args){
        
        System.out.println(
                IntStream
                .range(1, 5)
                .sum()
        );
    }
}
