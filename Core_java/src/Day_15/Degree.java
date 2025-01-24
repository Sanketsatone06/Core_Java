package Day_15;

public class Degree {
	
	
	
		void getDegree () {
			System.out.println( "I got a degree");
		}
		
		public class Undergraduate{
			void getDegree() {
				System.out.println( "I am an Undergraduate" );
			}
		}
		public class Postgraduate{
			void getDegree() {
				System.out.println("I am a Postgraduate");
			}
		}

	public static void main(String[] args) {
		
		Degree obj = new Degree();
		obj.getDegree();
		
		Degree .Undergraduate obja = obj.new Undergraduate();
		obja.getDegree();
		
		Degree .Postgraduate objb = obj.new Postgraduate();
		objb.getDegree();
	
		}
}
