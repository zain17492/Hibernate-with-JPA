package entities;

import java.io.Serializable;


@Enitiy
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private int Id;
	private String Title;
	private String Authour;
	private Double Price;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthour() {
		return Authour;
	}
	public void setAuthour(String authour) {
		Authour = authour;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	
	
	
	


}
