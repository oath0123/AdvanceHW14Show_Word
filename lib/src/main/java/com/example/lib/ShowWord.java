package com.example.lib;

public class ShowWord {
    String a = "I $am 5a$ go68od#@$ st-ude[nt].";
    String changeStr = "";

    public void ShowWord() {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= (char) 65 && a.charAt(i) <= (char) 90 || a.charAt(i) >= (char) 97 && a.charAt(i) <= 122 || a.charAt(i) == (char) 32) {
                changeStr += a.charAt(i);
            }
        }
        System.out.println(changeStr);
    }
}
