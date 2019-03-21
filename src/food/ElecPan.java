package food;

public class ElecPan implements Pan //is a 관계 , 이  순간부터 elecpan은 pan이 된다. 즉 같은 자료형이 된다. 
{
	public void addHeat()
	{
		System.out.print("전기로 팬을 달구다");
	}
}
