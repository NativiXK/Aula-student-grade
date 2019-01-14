package classroom;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double FinalGrade() {
		return (nota1 + nota2 + nota3);
	}

	public String State() {
		if (FinalGrade() >= 60) {
			return "PASS";
		} else if (FinalGrade() < 60) {
			return "FAILED" + "\nMISSING = " + (60.00 - FinalGrade() +  "POINTS");
		} else {
			return "Empty";
		}
	}

}
