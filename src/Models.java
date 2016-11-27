
public abstract class Models implements Car{
	
	public void model(){
		System.out.println("BMW");
	}

	public void year(){
		System.out.println("2013");
	}
	public void color(){
		System.out.println("Red");
	}
	public abstract void plate();
}
