package astonorall;

import org.testng.annotations.Test;

public class Loops {
	@Test
	public void facto() {
		int fact = 1;
		int x = 5;
		for (int i = 1; i < x; i++) {
			fact = fact * i;
		}
		System.out.println("factorial is:" + fact);
	}

	@Test
	public void febo() {
		int febo1 = 1, febo2 = 1, febonaci = 1;
		for (int i = 1; i < 5; i++) {
			febo1 = febo2;
			febo2 = febonaci;
			febonaci = febo1 + febo2;
			System.out.println("febonaci is :" + febonaci);
		}

	}

	@Test
	public void max() {
		int[] a = { 22, 55, 77, 88, 200 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[0] < a[i]) {
				a[i]=max;
				
			}
			System.out.println("maxnumber is:" + max);
		}

		

	}
}
