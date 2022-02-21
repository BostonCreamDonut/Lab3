public class ArraySum
{
	private int sum=0;
	private int reset=0;
	public int sumOfArray(Integer[] a, int index)
	{
		if(reset==1)
		{
			sum=0;
			reset=0;
		}
		if(index>=0)
		{
			sum+=a[index];
			index--;
			sumOfArray(a, index);
		}
		reset=1;
		return sum;
	}
}
