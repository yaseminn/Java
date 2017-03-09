package factory;

public interface User {
	
	/*
	 * Eğer variable oluşturulursa static final olarak oluşturuluyor ve bu nedenle içerik değiştirilemiyor.
	 * public static final String name = "aa";
	 */
	
	public abstract void create();
}
