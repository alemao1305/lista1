package list1.exe3;

public class Complexo {
double x, y;
	
	//default constructor
	Complexo(){}	

	Complexo(double x, double y) {
		this.x = x;
		this.y = y;
	}
	  
	void mostrar() {
		System.out.println(x);
		System.out.println(y);
	}
	
	Complexo soma(Complexo z) {
		Complexo result = new Complexo();
		result.x = x + z.x;
		result.y = y + z.y;
		return result;
	}
	
	Complexo multiplica(Complexo z) {
		Complexo result = new Complexo();
		result.x = (x*z.x) - (y*z.y);
		result.y = (x*z.y) + (y*z.x);
		return result;
	}
	
   	public String toString() {
        	return x + "+" + y + "i";
    	}
    
    	double modulo(){
        	return Math.sqrt((x*x)+(y*y));	
    	}

    	double argumentoPrincipal() {
		return Math.atan(y/x);
    	}

}
