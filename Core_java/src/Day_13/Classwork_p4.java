package Day_13;

public class Classwork_p4 {
static int marks1 = 55;
static int marks2 = 78;

class stdavg{
	static void average() {
		int sum = marks1+marks2;
		int avg = sum/2;
		System.out.println("sum of marks : " + sum);
		System.out.println("average of student  : " +avg);
	}
}
public static void main(String[]args) {
	stdavg.average();
}
}
