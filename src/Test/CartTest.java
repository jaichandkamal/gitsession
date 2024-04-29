package Test;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j=11;
		int k=12;
		
		
		
		CartTest c=new CartTest();
		int summ =c.carttesting(j, k);
		System.out.println(summ);
		System.out.println(c.status(false));
		
		
	}
	
	public int carttesting(int a, int b)

	{
		
	int sum=a+b;
	return sum;
	
	}
	
	public boolean status(boolean flag)
	{
	
		boolean isattended=flag;
		return flag;
		
	}
	
}
