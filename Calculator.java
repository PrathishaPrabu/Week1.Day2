package week1.Day2;

public class Calculator {
	
	public double add(int n1,int n2) {
		int sum=n1+n2;
		return sum;
	}
public double subraction(double n1,double n2) {
	double sub=n1-n2;
		return sub;
	}
public double multiply(double n1,double n2) {
	double mul=n1*n2;
		return mul;
	}
public int division(int n1,int n2) {
	int div=n1/n2;
		return div;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
		System.out.println("Calculation");
		System.out.println(obj.add(20, 30));
		System.out.println(obj.subraction(35.89, 24.01));
		System.out.println(obj.multiply(88, 23));
		System.out.println(obj.division(100, 5));

	}

}
