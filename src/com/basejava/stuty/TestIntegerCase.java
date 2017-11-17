package com.basejava.stuty;

public class TestIntegerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1 == i2);

        Integer i3 = 1000;
        Integer i4 = 1000;
        System.out.println(i3 == i4);

        Integer i5 = Integer.valueOf(100);
        Integer i6 = Integer.valueOf(100);
        System.out.println(i5 == i6);

        Integer i7 = Integer.valueOf(1000);
        Integer i8 = Integer.valueOf(1000);
        System.out.println(i7 == i8);
		
	}

}
