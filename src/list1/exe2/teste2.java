package list1.exe2;

public class teste2 {

	public static void main(String[] args) {
		Lampada light = new Lampada();


		for(int y=0; y<25; y++)
		{
		light.clickInterruptor();
		System.out.println(light.getState());
		}



		}



		}