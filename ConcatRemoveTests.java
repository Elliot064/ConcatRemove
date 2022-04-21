package com.vogella.junit.first;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ConcatRemoveTest{

  @Test
  void testYesForSmallStrings(){
       actual = ConcatRemove("head", "heed", 4);
       expect = "yes";
       Assert.assertEquals(actual, expect);
}

  @Test
  void testNoForSmallStrings(){
       actual = ConcatRemove("apple", "banana", 8);
       expect = "no";
       Assert.assertEquals(actual, expect);
}
