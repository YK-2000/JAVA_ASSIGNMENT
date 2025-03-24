package com.exercise;

class StringPlay {
    int convert;
    int max;

    public StringPlay() {}
}

class StringMethods {
    public int convertToInt(StringPlay sp, String str) {
        sp.convert = Integer.parseInt(str);
        return sp.convert;
    }

    public int getMax(StringPlay sp, String str, char ch) {
        sp.max = (int) str.chars().filter(c -> c == ch).count();
        return sp.max;
    }
}

public class StringDemo {

	public static void main(String[] args) {
		StringMethods sm = new StringMethods();
        StringPlay sp = new StringPlay();

        System.out.println(sm.getMax(sp, "fgfgfgf", 'g')); 
        System.out.println(sm.convertToInt(sp, "123")); 
	}

}
