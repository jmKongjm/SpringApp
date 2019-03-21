//������ �繰�� �����ϱ� ������ �ƴ϶�, ���� ����θ� �α� ����
//Ŭ�����̴�!!
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
		//�丮�� 1���� �����Ѵ�.
		//���̻� cook class���� ���� ���� new �ϴ� �ڵ尡
		//�������� �ʴ´�.
		//��? new ������ �ڿ��� �ݵ�� ��Ȯ�� ��ü�ڷ�����
		//����ؾ� �ϱ� ������ �� ������ ���յ��� ���δ�..args������ �������� ����ϰ� �� ��� new �����ڴ�
		//���� �����. �ᱹ cook class�� �ڽ��� �ʿ�� �ϴ� ���� ���� �ڽ��� �ڵ忡��
		//new ���� �ʰ� �ܺ��� ��ü�� cook ��ü���� �ʿ��� pan�� �����Ͽ� �����ϴ� ����� 
		//����ϰ� �Ǵµ� �̷��� ��ü ���� ����� ������ 'injection'�̶�� �Ѵ�.
		//Ư�� �������� ���� ��ü�� �����Ͽ� �����Ѵٰ� �Ͽ�
		//������ �֟�(dependency injection)�̶�� �Ѵ�. 
		//DI�� �ϼ��Ϸ��� �ڵ忡�� new�� ����ϸ� �� ��
		//�ذ�å? ��ü�� ������ �ڹ��ڵ忡�� ���� ����, �ܺ���
		//���簡 ��ü�� ��� �������༭ ���Ա��� �����ְ� �Ѵ�. 
		//�ٷ� spring framework�� �̰��� ���� ���̴�...
		
		//������ ���� �ĸ����� ��ü�� �ҷ��ͼ� ���Խ��Ѻ���!
		ApplicationContext context = null;
		//Ŭ������ �ƴ� �Ϲ� ���ҽ��� ��Ű���� ������� ����
		//�� ��ſ� �Ϲ� ���丮 ���(/)�� �����ؼ� ��
		try
		{
		context = new ClassPathXmlApplicationContext("spring/config/config.xml");
		}catch(BeansException e) {e.printStackTrace();}
		//context �� �����̳ʰ� ������ ���� bean  �߿��� ���ϴ� ��ü��
		//���� ����!
		//Pan pan = (Pan)context.getBean("elecPan");
		Cook cook = (Cook)context.getBean("cook");
		//Cook���� pan�� ��������� �Ѵ�.
		//���� �̰� xml���� �������踦 ǥ���ؾ� �Ѵ�. 
		cook.Work();
		MyWin mywin = (MyWin)context.getBean("myWin");
		

	}

}
