package spring;

public class HelloSpring2 implements Hello
{
	public HelloSpring2()
	{
		System.out.println(this.getClass().getName() + " 생성자 호출");
	}
	
	@Override
	public void sayHello(String name)
	{
		System.out.println("Hello " + name);
	}

}
