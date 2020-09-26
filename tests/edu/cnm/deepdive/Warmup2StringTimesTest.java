package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class Warmup2StringTimesTest {

  @ParameterizedTest(name = "[{index}] str = 0, n = 1, expected = 2")
  @CsvFileSource(resources = "string-times.csv", numLinesToSkip = 1)
  void stringTimes(String str, int n, String expected) {
    Warmup2StringTimes warmup2StringTimes = new Warmup2StringTimes();
    String actual = warmup2StringTimes.stringTimes(str, n);
    assertEquals(actual,expected);
  }
}