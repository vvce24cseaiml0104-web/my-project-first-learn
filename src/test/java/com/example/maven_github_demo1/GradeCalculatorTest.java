package com.example.maven_github_demo1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class GradeCalculatorTest {
@Test
void testTotal()
{
	assertEquals(225,GradeClass.calculateTotal(75,68,82));
	}
@Test
void testAverage()
{
	assertEquals(75.0,GradeClass.calculateAverage(75,68,82));
}
@Test
void testPass()
{
	assertTrue(GradeClass.isPass(75.0));
}
@Test
void testFail() {
	assertFalse(GradeClass.isPass(35.0));
}
}
