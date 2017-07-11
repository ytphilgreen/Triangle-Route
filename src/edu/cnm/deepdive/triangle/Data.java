/**
 * 
 */
package edu.cnm.deepdive.triangle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * @author Yolanda Philgreen
 *
 */
 class Data {

 int[][] nodes = null;

 Data(String file) {
   File inputFile = new File (file);
   try (
       FileReader reader = new FileReader (file);
       BufferedReader buffer = new BufferedReader (reader);
       ) {
     LinkedList<int[]> work = new LinkedList<>();
     String line;
     while ((line = buffer.readLine()) != null) {
       if (line.trim().length() > 0) {
         String[] values = line.trim().split("\\s+");
         int[] intValues = new int[values.length];
         for(int i = 0; i < values.length; i++) {
           intValues[i] = Integer.parseInt(values[i]);
         }
         work.add(intValues);
       }
     }
     nodes = work.toArray(new int [0][]);
   } catch (FileNotFoundException e) {
    e.printStackTrace();
  } catch (IOException e) {
    e.printStackTrace();
  }
 }
   
}
