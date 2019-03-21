/*현실의 사물 중 프라이팬을 정의한다!
 */
package food;

public class FriPan implements Pan //is a 관계 FriPan은 Pan이다. 
{
	public void addHeat()
	{
		System.out.print("불로 팬을 달구다");
	}
	
}
