package com.exercise;

class CustomException {
	static void checkAge(int age) {
		if(age < 20) {
			throw new AgeException("Not a valid age");
		}
		else {
			System.out.println("A valid age");
		}
	}
		public static void main(String[] args) {
			checkAge(30);
	}
}

class AgeException extends RuntimeException {
	AgeException (String s){
		System.out.println(s);
	}
}
