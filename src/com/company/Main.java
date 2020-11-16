package com.company;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the path:");
        String path = in.nextLine();

        String normPath = normalizePath(path);
        System.out.println("Input: " + path);
        System.out.println("Output: " + normPath);
    }

    public static String normalizePath(String path) {
        String[] pathSplited = path.split("/");

        Stack<String> pathStack = new Stack();
        for (int i = 0; i < pathSplited.length; i++) {
            switch (pathSplited[i]) {
                case ".":
                    break;
                case "..":
                    if (!pathStack.empty() && !pathStack.peek().equals("..")) {
                        pathStack.pop();
                    } else {
                        pathStack.push("..");
                    }
                    break;
                default:
                    pathStack.push(pathSplited[i]);
                    break;
            }
        }
    return stackToPath(pathStack);
    }

    public static String stackToPath(Stack<String> path) {
        StringBuffer answer = new StringBuffer();
        Iterator iterator = path.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if (iterator.hasNext()) {
                answer.append(s);
                answer.append("/");
            } else {
                answer.append(s);
            }
        }
        return answer.toString();
    }
}