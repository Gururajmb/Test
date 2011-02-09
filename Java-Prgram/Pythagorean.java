public class Pythagorean {
	public int getProductOftriplet() {
		int productValue = 0;
		loop1:for (int a = 1; a <1000/3; a++) {
			for (int b = 1; b < 1000/2; b++) {
				int c=(1000-a-b);
				if(a*a+b*b==c*c)
				{	if(a+b+c==1000)
					{
						System.out.println(a+"    "+b+"    "+c);
						System.out.println(""+(a*b*c));
						productValue = (a*b*c);
						break loop1;
					}
				}

			}

		}
		return productValue;
	}
}
