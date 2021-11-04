package it.unibo.oop.lab.collections1;

import java.util.*;

/**
 * Example class using {@link java.util.List} and {@link java.util.Map}.
 * 
 */
public final class UseCollection {
	
    private UseCollection() {
    }

    /**
     * @param s
     *            unused
     */
    
    private static final int ELEMENTS_ADDED_HEAD = 100_000;
    private static final int ELEMENTS_ADDED_MIDDLE = 1_000;
    
    private static void calculatePerformance(long time, String subject) {
    	time = System.nanoTime() - time;
        System.out.println(subject + " took " + ((double)time) / 1_000_000 +"ms to process.");
    }
    
    public static void main(final String... s) {
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example TestPerformance.java.
         */
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    	
    	Map<String, Long> map = new HashMap<String, Long>();
    	List<Integer> array = new ArrayList<Integer>();
    	List<Integer> linked;
    	
    	for(int i = 1000; i <= 2000; i++) {
    		array.add(i);
    	}
    	linked = new LinkedList<Integer>(array);
    	

    	int temp = linked.get(linked.size() - 1);
    	linked.set(linked.size() - 1, linked.get(0));
    	linked.set(0, temp);
    	
    	System.out.println("ArrayList :");
    	for(int num : array) {
    		System.out.println(num);
    	}
    	System.out.println();
    	
    	
    	long time = System.nanoTime();
    	for(int i = 0; i < ELEMENTS_ADDED_HEAD; i++) {
    		array.add(0, (int)(Math.random() * 100));
    	}
    	calculatePerformance(time, "ArrayList head insertion");
    	time = System.nanoTime();
    	for(int i = 0; i < ELEMENTS_ADDED_HEAD; i++) {
    		linked.add(0, (int)(Math.random() * 100));
    	}
    	calculatePerformance(time, "LinkedList head insertion");
    	
    	time = System.nanoTime();
    	for(int i = 0; i < ELEMENTS_ADDED_MIDDLE; i++) {
    		array.add(array.size() / 2, (int)(Math.random() * 100));
    	}
    	calculatePerformance(time, "ArrayList head insertion");
    	time = System.nanoTime();
    	for(int i = 0; i < ELEMENTS_ADDED_MIDDLE; i++) {
    		linked.add(linked.size() / 2, (int)(Math.random() * 100));
    	}
    	calculatePerformance(time, "LinkedList head insertion");
    	System.out.println();
    	
    	/*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         * 
         * Africa -> 1,110,635,000
         * 
         * Americas -> 972,005,000
         * 
         * Antarctica -> 0
         * 
         * Asia -> 4,298,723,000
         * 
         * Europe -> 742,452,000
         * 
         * Oceania -> 38,304,000
         */
    	
    	map.put("Africa", 1_110_635_000L);
    	map.put("Americas", 972_005_000L);
    	map.put("Antarctica", 0L);
    	map.put("Asia", 4_298_723_000L);
    	map.put("Europe", 742_452_000L);
    	map.put("Oceania", 38_304_000L);
    	
    	long population = 0;
    	for(long n : map.values()) {
    		population += n;
    	}
    	System.out.println("World population is: "+ population);
    	
    }
}
