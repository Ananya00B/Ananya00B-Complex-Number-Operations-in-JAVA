import java.util.Scanner;

public class ComplexNumber {
	private double _real;
	private double _imag;
	
	public ComplexNumber(double r, double i) {
		_real = r;
		_imag = i;
	}

	public ComplexNumber() {
		System.out.println("Enter real value");
		_real = Double.parseDouble(scanner());
		System.out.println("Enter imaginary value");
		_imag = Double.parseDouble(scanner());
	}
	
	public String scanner() {
		Scanner input = new Scanner(System.in);
		return input.next();
	}
	
	public String toString() {
		if(_real == 0 && _imag == 0) {
			return "0";
		}else if(_real == 0) {
			return (Double.toString(_imag) + "i");
		}else if(_imag == 0) {
			return Double.toString(_real);
		}else if(_imag > 0){
			return (Double.toString(_real) + " + " + Double.toString(_imag) + "i");
		}else {
			return (Double.toString(_real) + " " + Double.toString(_imag) + "i");
		}
	}
	
	public static ComplexNumber addition(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber sum = new ComplexNumber(0, 0);
		sum._real = c1._real + c2._real;
		sum._imag = c1._imag + c2._imag;
		return sum;
	}

	public static ComplexNumber subtraction(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber sub = new ComplexNumber(0, 0);
		sub._real = c1._real - c2._real;
		sub._imag = c1._imag - c2._imag;
		return sub;
	}

	public static ComplexNumber multiplication(ComplexNumber c1, ComplexNumber c2) {
		ComplexNumber mul = new ComplexNumber(0, 0);
		mul._real = c1._real*c2._real - c1._imag*c2._imag;
		mul._imag = c1._real*c2._imag + c1._imag*c2._real;
		return mul;
	}

	public ComplexNumber conjugate() {
		ComplexNumber conj = new ComplexNumber(_real, -_imag);		
		return conj;
	}

	public ComplexNumber inverse() {
		double denom = _real*_real + _imag*_imag;
		ComplexNumber inv = new ComplexNumber(_real/denom, -_imag/denom);		
		return inv;
	}

	public static ComplexNumber division(ComplexNumber c1, ComplexNumber c2) {
		double denom = c2._real*c2._real + c2._imag*c2._imag;
		ComplexNumber nom = multiplication(c1, c2.conjugate());
		ComplexNumber div = new ComplexNumber(nom._real/denom, nom._imag/denom);		
		return div;
	}

}
