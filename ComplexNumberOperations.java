public class ComplexNumberOperations {

	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(3, 2);
		System.out.print("First Complex Number c1 = ");
		System.out.println(c1.toString());
		
		System.out.println("Input second complex number,");
		ComplexNumber c2 = new ComplexNumber();	
		System.out.print("Second Complex Number c2 = ");
		System.out.println(c2.toString());
		
		//Conjugate
		System.out.println("Conjugate of c1 : " + c1.conjugate());
		
		//Inverse
		System.out.println("Inverse of c2 = (1/c2) :" + c2.inverse());
		
		//Addition
		ComplexNumber sum = ComplexNumber.addition(c1, c2);
		System.out.println("Addition(c1+c2) : " + sum);
		
		//Subtraction
		ComplexNumber subtract = ComplexNumber.subtraction(c1, c2);
		System.out.println("Subtraction(c1-c2) : " + subtract);
		
		//Multiplication
		ComplexNumber mul = ComplexNumber.multiplication(c1, c2);
		System.out.println("Multiplication(c1*c2) : " + mul);
		
		//Division
		ComplexNumber div = ComplexNumber.division(c1, c2);
		System.out.println("Division(c1/c2) : " + div);
	}

}
