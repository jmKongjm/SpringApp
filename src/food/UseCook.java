//현실의 사물을 정의하기 위함이 아니라, 단지 실행부를 두기 위한
//클래스이다!!
package food;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gui.MyWin;

public class UseCook
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//요리사 1명을 생성한다.
		//더이상 cook class에는 직접 팬을 new 하는 코드가
		//존재하지 않는다.
		//왜? new 연산자 뒤에는 반드시 정확한 객체자료형을
		//명시해야 하기 때문에 이 과정이 결합도를 높인다..args앞으로 스프링을 사용하게 될 경우 new 연산자는
		//보기 힘들다. 결국 cook class는 자신이 필요로 하는 팬을 직접 자신의 코드에서
		//new 하지 않고 외부의 객체가 cook 객체에게 필요한 pan을 생성하여 주입하는 방식을 
		//사용하게 되는데 이러한 객체 주입 방법을 가리켜 'injection'이라고 한다.
		//특히 의존성이 높은 객체는 주입하여 개발한다고 하여
		//의존성 주읩(dependency injection)이라고 한다. 
		//DI를 완성하려면 코드에서 new를 사용하면 안 됨
		//해결책? 객체의 생성을 자바코드에서 하지 말고, 외부의
		//존재가 객체를 대신 생성해줘서 주입까지 시켜주게 한다. 
		//바로 spring framework이 이것을 해줄 것이다...
		
		//스프링 설정 파링에서 객체를 불러와서 주입시켜보자!
		ApplicationContext context = null;
		//클래스가 아닌 일반 리소스가 패키지에 들어있을 때는
		//점 대신에 일반 디렉토리 기법(/)을 적용해서 쓴
		try
		{
		context = new ClassPathXmlApplicationContext("spring/config/config.xml");
		}catch(BeansException e) {e.printStackTrace();}
		//context 즉 컨테이너가 보유한 여러 bean  중에서 원하는 객체를
		//얻어와 보자!
		//Pan pan = (Pan)context.getBean("elecPan");
		Cook cook = (Cook)context.getBean("cook");
		//Cook에는 pan을 주입해줘야 한다.
		//따라서 이걸 xml에서 설정관계를 표현해야 한다. 
		cook.Work();
		MyWin mywin = (MyWin)context.getBean("myWin");
		

	}

}
