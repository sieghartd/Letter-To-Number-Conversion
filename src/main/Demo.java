package main;

import model.Conversion;

public class Demo {

    public static void main(String[] args) {
//        String s = "hello world";
//        String t = "";
//        for (int i = 0; i < s.length(); ++i) {
//            char ch = s.charAt(i);
//            if (!t.isEmpty()) {
//                t += " ";
//            }
//            int n = (int)ch - (int)'a' + 1;
//            t += String.valueOf(n);
//        }
//        System.out.println(t);

            Conversion conv = new Conversion();
            conv.initialize();

            conv.Calculate("Y");
    }
}
