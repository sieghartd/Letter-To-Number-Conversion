package model;

import java.util.HashMap;

public class Conversion {

    private HashMap<String, Integer> letterNumber = new HashMap<>();

    public void initialize () {
        letterNumber.put("A",1);
        letterNumber.put("B",2);
        letterNumber.put("C",3);
        letterNumber.put("D",4);
        letterNumber.put("E",5);
        letterNumber.put("F",6);
        letterNumber.put("G",7);
        letterNumber.put("H",8);
        letterNumber.put("I",9);
        letterNumber.put("J",10);
        letterNumber.put("K",11);
        letterNumber.put("L",12);
        letterNumber.put("M",13);
        letterNumber.put("N",14);
        letterNumber.put("O",15);
        letterNumber.put("P",16);
        letterNumber.put("Q",17);
        letterNumber.put("R",18);
        letterNumber.put("S",19);
        letterNumber.put("T",20);
        letterNumber.put("U",21);
        letterNumber.put("V",22);
        letterNumber.put("W",23);
        letterNumber.put("X",24);
        letterNumber.put("Y",25);
        letterNumber.put("Z",26);
    }

    public void Calculate(String entry) {
        String t = "";
        int i;
        int temp = 0;
        for(i = 0; i < entry.length(); i++) {
            char ch = entry.charAt(i);
            letterNumber.get(ch);
            temp = ch - 64 + temp;
            if(!t.isEmpty()) {
                t += " ";
            }
            int n =(int)ch - (int)'a' + 33;
            t += String.valueOf(n);
            System.out.println(t);
            System.out.println("The total is " + temp);
        }
    }

//    public void Calculate(String entry) {
//        String t = "";
//        int i;
//        for(i = 0; i < entry.length(); i++) {
//            char ch = entry.charAt(i);
//            if(!t.isEmpty()) {
//                t += i;
//            }
//            int n =(int)ch - (int)'a' + 1;
//            t += String.valueOf(n);
//            System.out.println(t);
//        }

//        letterNumber.put();
//    }
}
