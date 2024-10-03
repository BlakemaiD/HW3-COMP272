/*
 * *** Blake Doan / 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

        /**
         * Method different()
         *
         * Given two TreeSets of integers, return a TreeSet containing all elements
         * that are NOT in both sets. In other words, return a TreeSet of all the
         * elements that are in one set but not the other.
         */

        public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

                // This can be done numerous ways, but once such will only that
                // *several* lines of code. Hint: create two temporary TreeSets and utilize the
                // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

                Set<Integer> tempTree1 = new TreeSet<> (setA);
                Set<Integer> tempTree2 = new TreeSet<> (setB);

                tempTree1.removeAll(setB);
                tempTree2.removeAll(setA);

                tempTree1.addAll(tempTree2);

                return tempTree1;
        }


        /**
         * Method removeEven()
         *
         * Given a treeMap with the key as an integer, and the value as a String,
         * remove all <key, value> pairs where the key is even.
         */

        public static void removeEven(Map<Integer, String> treeMap) {

                if (treeMap == null) {
                        return;
                }

                //To go through a map, you have to use an iterator.
                Iterator<Integer> itr = treeMap.keySet().iterator();
                while (itr.hasNext()) {
                        Integer val = itr.next();

                        if (val % 2 == 0) {
                                itr.remove();
                        }
                }
                return;
        }


        /**
         * Method treesEqual()
         *
         * Given two treeMaps, each with the key as an integer, and the value as a String,
         * return a boolean value indicating if the two trees are equal or not.
         */

        public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
                if(tree1.equals(tree2)){
                        return true;
                } else {
                        return false;
                }
        }

} // end treeProblems class
