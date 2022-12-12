package ru.vsu.cs;

public class Institute {

	public String name;
	public String address;

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Institute{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}