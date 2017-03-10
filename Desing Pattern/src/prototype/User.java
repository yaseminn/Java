/**
 * 
 */
package prototype;

/**
 * @date Mar 10, 2017
 */
public abstract class User implements Cloneable {

	private String id;
	protected String type;
	
	abstract void create();
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Object clone(){
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		return clone;
	}

	
	
	
}
