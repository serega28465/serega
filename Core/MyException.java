package myExceptions;

import java.io.IOException;

public class Methods {

	public static void main(String[] args) {
		
	}

//	Якщо  a<0, b<0 викидаємо IllegalArgumentException 
//	Якщо a=0 b!=0  викидаємо ArithmeticException 
//	Якщо a!=0 b=0  викидаємо ArithmeticException 
//	Якщо a=0 b=0   викидаємо IllegalAccessException 
//	Якщо a>0 b>0   викидаємо MyException
	
	static void div(int a, int b) throws IllegalAccessException{
		if(a<0&&b<0){
			try {
				System.out.println(a/b);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		if(a==0 && b!=0){
			try {
				System.out.println(a/b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		if(a!=0 && b==0){
			try {
				System.out.println(a/b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		if(a==0 && b==0){
			System.out.println(a/b);
		}
		if(a>0 && b>0){
			try {
				System.out.println(a/b);
				checked();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	static void mult(int a, int b) throws IllegalAccessException{
		if(a<0&&b<0){
			try {
				System.out.println(a*b);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		if(a==0 && b!=0){
			try {
				System.out.println(a*b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		if(a!=0 && b==0){
			try {
				System.out.println(a*b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		if(a==0 && b==0){
			System.out.println(a*b);
		}
		if(a>0 && b>0){
			try {
				System.out.println(a*b);
				checked();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	static void add(int a, int b) throws IllegalAccessException{
		if(a<0&&b<0){
			try {
				System.out.println(a+b);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		if(a==0 && b!=0){
			try {
				System.out.println(a+b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		if(a!=0 && b==0){
			try {
				System.out.println(a+b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		if(a==0 && b==0){
			System.out.println(a+b);
		}
		if(a>0 && b>0){
			try {
				System.out.println(a+b);
				checked();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	static void min(int a, int b) throws IllegalAccessException{
		if(a<0&&b<0){
			try {
				System.out.println(a-b);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		if(a==0 && b!=0){
			try {
				System.out.println(a-b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		if(a!=0 && b==0){
			try {
				System.out.println(a-b);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		if(a==0 && b==0){
			System.out.println(a-b);
		}
		if(a>0 && b>0){
			try {
				System.out.println(a-b);
				checked();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	static void checked() throws IOException{
		throw new IOException("My Exception!!!");
	}
	
	
	
}
