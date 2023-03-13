package org.modelo.sregion;

public class S_Region {

	private int id;
	private String name;

	public S_Region() {
		super();
		// TODO Auto-generated constructor stub
	}

	public S_Region(int id) {
		super();
		this.id = id;
	}

	public S_Region(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
