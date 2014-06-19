package serialisation2;


public abstract class Animal implements java.io.Serializable {


	private String name;
	private String type;

	public void Check()
	   {
	      System.out.println( name
	                           + " " + type);
	   }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public void run()
	{
		
		
		return;
	}
	
	
	
}
	
