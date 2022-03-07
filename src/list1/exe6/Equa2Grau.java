package list1.exe6;


	public class Equa2Grau {

		double a=-1;
		double b=300;
		double c=985;



		double delta(){
			double delta;
			delta = ((b*b)-(4*a*c));

			return delta;
		}

		double r1(){
			double x1 = (-b + Math.sqrt(delta())) / (2 * a);
				if(delta()<0){
					x1=-1;
				}

				return x1;
		}

		double r2(){
			double x2 = (-b - Math.sqrt(delta())) / (2 * a);
				if(delta()<0){
					x2= -1;
				}

				return x2;
		}
}

