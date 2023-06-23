package org.example.Lesson4.ClassWork;

import java.util.Stack;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("simplifyPath() = " + simplifyPath("/home/"));
        System.out.println("simplifyPath() = " + simplifyPath("/../"));
        System.out.println("simplifyPath() = " + simplifyPath("/home//foo/"));

    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        StringBuilder res = new StringBuilder();
        String[] subPath = path.split("/");
        for (String s : subPath) {
            if ("..".equals(s)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!".".equals(s) && !s.isEmpty()) {
                stack.push(s);
            }
        }
        if (stack.isEmpty()) return "/";
        while (!stack.isEmpty()) {
            res.append("/");
            res.append(stack.pop());
        }
        return res.toString();
    }
}
