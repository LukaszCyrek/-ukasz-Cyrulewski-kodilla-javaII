package com.kodilla.testing.com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

 public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
  ArrayList<Integer> evenNumbers = new ArrayList<>();
  for (int i=0; i< numbers.size(); i++) {
   Integer integer = numbers.get(i);
   if (integer % 2 == 0) {
    evenNumbers.add(integer);

   }
  }
  return evenNumbers;
 }
}
