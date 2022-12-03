package week1.day1;

import javax.swing.plaf.multi.MultiButtonUI;

public class CallMaths {



	public static void main(String[] args) {
		Maths Obj= new Maths();
		int add = Obj.add(10, 5);
		add = Obj.add(10,5);
		System.out.println(add);

		int sub = Obj.sub(10, 5);
		sub= Obj.sub(10,5);
		System.out.println(sub);


		int div = Obj.div(10 ,5);		
		div = Obj.div(10, 5);
		System.out.println(div);

		int multiplication = Obj.multiplication(10, 5);
		multiplication = Obj.multiplication(10, 5);
		System.out.println(multiplication);

	}

}
