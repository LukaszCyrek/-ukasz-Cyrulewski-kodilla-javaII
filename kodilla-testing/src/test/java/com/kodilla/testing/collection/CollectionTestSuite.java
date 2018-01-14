package com.kodilla.testing.collection;
import com.kodilla.testing.com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;


public class CollectionTestSuite {
    OddNumbersExterminator oddNumberExterminator = new OddNumbersExterminator();

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test

    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> emptyList = new ArrayList<>();
      ArrayList<Integer> result = oddNumberExterminator.exterminate(emptyList);
        Assert.assertTrue(result.size() == 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(6);
        list.add(8);
        ArrayList<Integer> result = oddNumberExterminator.exterminate(list);
        Assert.assertTrue(result.size()== 3);
    }
}
