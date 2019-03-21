/*현실의 사물 중 요리사를 정의한다 */
package food;
//Cook이라는 클래스가 FriPan이라는 클래스와 
//너무 결합도가 높다. 결합도가 높으면 의존성이 커지므로
//유지보수성은 떨어지게 된다.
//해결책  : 의존성을 약화시켜서 해결해야 한다. 

public class Cook
{
	Pan pan = null; //Cook has a pan
	//has a 관계란? 특정 클래스가 다른 클래스를 포함하고 있는 관계 
	
	public Cook(Pan pan)//객체의 인스턴스가 생성될 때 호출되는 메서드 
	//객체가 새엉되는 시점에 무조건 호출된다고 하여 생성자라고 한다. 
	{
		this.pan = pan;
		//프라이팬을 생성한다!!
		//new연산자로 필요한 객체를 일일이 생성하는 코드기법은
		//고정적인 하드코딩이므로 결합도를 여전히 높이고 있다. 
		//pan = new ElecPan();
		
	}
	public void Work()
	{
		System.out.println("요리사가 일을 시작합니다!");
		pan.addHeat();
	
	}
	
}
