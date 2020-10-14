package com.baby.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//This class was designed to be used to run the BabysitterTest class
public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(BabysitterTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
   }
}