package by.epam.tr.main;

import java.util.Objects;

public class Customer  {
	
	private int id;
	private String name;
	private String surname;
	private String patronymic;
	private long kardNumber;
	private String address;
	private long bankNumber;
	public Customer(int id, String name, String surname, String patronymic, long kardNumber, String address, long bankNumber) {
		this.id=id;
		this.name=name;
		this.surname=surname;
		this.patronymic=patronymic;
		this.kardNumber=kardNumber;
		this.address=address;
		this.bankNumber=bankNumber;
	}
	public Customer() {
		this.id=0;
		this.name="";
		this.surname="";
		this.patronymic="";
		this.kardNumber=0;
		this.address="";
		this.bankNumber=0;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public long getKardNumber() {
		return kardNumber;
	}
	public void setKardNumber(long kardNumber) {
		this.kardNumber = kardNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getBankNumber() {
		return bankNumber;
	}
	public void setBankNumber(long bankNumber) {
		this.bankNumber = bankNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, bankNumber, id, kardNumber, name, patronymic, surname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && bankNumber == other.bankNumber && id == other.id
				&& kardNumber == other.kardNumber && Objects.equals(name, other.name)
				&& Objects.equals(patronymic, other.patronymic) && Objects.equals(surname, other.surname);
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", surname=" + surname + ", patronymic=" + patronymic
				+ ", kardNumber=" + kardNumber + ", address=" + address + ", bankNumber=" + bankNumber + "]";
	}
	
	
	
}
