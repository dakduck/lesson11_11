package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void normalizePath1() {
        System.out.println("\n*** Test 1 ***");
        String path = "./croc";
        String answer = "croc";
        String actual = Main.normalizePath(path);

        Assert.assertEquals(answer, actual);

        System.out.println("Input: " + path);
        System.out.println("Output: " + actual);
    }

    @Test
    public void normalizePath2() {
        System.out.println("\n*** Test 2 ***");
        String path = "КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики";
        String answer = "../мемы/котики";
        String actual = Main.normalizePath(path);

        Assert.assertEquals(answer, actual);

        System.out.println("Input: " + path);
        System.out.println("Output: " + actual);
    }

    @Test
    public void normalizePath3() {
        System.out.println("\n*** Test 3 ***");
        String path = "./";
        String answer = "";
        String actual = Main.normalizePath(path);

        Assert.assertEquals(answer, actual);

        System.out.println("Input: " + path);
        System.out.println("Output: " + actual);
    }

    @Test
    public void normalizePath4() {
        System.out.println("\n*** Test 4 ***");
        String path = "f1/./f1_1/../../f2/f2_1/./../f2_2/f2_2_1/.";
        String answer = "f2/f2_2/f2_2_1";
        String actual = Main.normalizePath(path);

        Assert.assertEquals(answer, actual);

        System.out.println("Input: " + path);
        System.out.println("Output: " + actual);
    }

    @Test
    public void normalizePath5() {
        System.out.println("\n*** Test 5 ***");
        String path = "../pop/./ts/../..";
        String answer = "..";
        String actual = Main.normalizePath(path);

        Assert.assertEquals(answer, actual);

        System.out.println("Input: " + path);
        System.out.println("Output: " + actual);
    }
}