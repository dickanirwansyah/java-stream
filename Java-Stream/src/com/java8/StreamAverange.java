/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8;

import java.util.Arrays;

/**
 *
 * @author dickaspring
 */
public class StreamAverange {
    
    public static void main(String[] args){
        
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::print);
    }
}
