package dModel;
/*
 *  CREATE TABLE EXAMPLE(
 *	  ID VARCHAR2(20) PRIMARY KEY,
 *	  PASSWORD VARCHAR2(20) NOT NULL,
 *	  NAME VARCHAR2(50) NOT NULL
 *  );
 * 
 * 
 * */
public class ExampleDto {
	private String id;
	private String password;
	private String name;
	
	
	public ExampleDto(){
		super();
	}
	public ExampleDto(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ExampleDto [id=" + id + ", password=" + password + ", name="
				+ name + "]";
	}
	
}
