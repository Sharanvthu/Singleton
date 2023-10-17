 class Example
{
	 static Example e=null;
	private Example()
	{
		System.out.println("object created");
	}
	public static void createObj()
	{
		if(e==null)
		{
			e=new Example();
		}
		else
			System.out.println("Object can't create");
	}
}
public class Test {

	public static void main(String[] args) 
	{
		Example.createObj();
		Example.createObj();

	}

}
