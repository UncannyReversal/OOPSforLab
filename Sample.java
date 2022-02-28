import java.util.Scanner;

class ImproperWeightException extends Exception{
	double bmi;
	ImproperWeightException(double x){
		bmi=x;
	}
	public String toString() {
		return "BMI Exception - "+bmi;
	}
}
public class Sample {
	static void evaluate(double weight,double height) 
                throws ImproperWeightException{
		double bmi=weight/Math.pow(height,2);
		System.out.println(bmi);
		if(bmi>=18.5 && bmi<=24.9)
			System.out.println("Valid BMI");
		else
			throw new ImproperWeightException(bmi);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height,weight;
		System.out.print("Enter the height in metres : ");
		Scanner sc=new Scanner(System.in);
		height=sc.nextDouble();
		System.out.print("Enter the weight in kg : ");
		weight=sc.nextDouble();
		try {
			evaluate(weight,height);
		}
		catch(ImproperWeightException e) {
			System.out.print(e);
		}
		sc.close();
	}

}
