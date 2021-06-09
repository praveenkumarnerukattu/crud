/*package com.cg.cms.entities;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customertable")

public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column (name="fname")
	private String firstName;
	@Column(name="lname")
	private String lastName;
	@Column (name="email")
	private String email;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", mobile=" + mobile + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	private String address;
	@Column(name="mob")
	private long mobile;
	
	public Customer() {
		super();
	}
}*/

/*package com.cg.cms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "cust_tbl")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "fname")
	@NotNull
	@Size(min = 2, message = "First Name should have mininum 2 characters!!")
	private String firstName;
	@Column(name = "lname")
	@NotNull
	@Size(min = 2, message = "Last Name should have mininum 2 characters!!")
	private String lastName;
	@Column(name = "email")
	@Email(message = "Enter a valid email address!!")
	private String email;
	private String address;
	@Column(name = "mob")
//	@Pattern(regexp = "[9-7]{9}")
	private long mobile;

	public Customer() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", mobile=" + mobile + "]";
	}

}*/



package com.cg.cms.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cust_tbl")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "fname")
	@NotNull
	@Size(min = 2, message = "First Name should have mininum 2 characters!!")
	private String firstName;
	@Column(name = "lname")
	@NotNull
	@Size(min = 2, message = "Last Name should have mininum 2 characters!!")
	private String lastName;
	@Column(name = "email")
	@Email(message = "Enter a valid email address!!")
	private String email;
	private String address;
	@Column(name = "mob")
//	@Pattern(regexp = "[9-7]{9}")
	private long mobile;

	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "cp_fk", referencedColumnName = "id")
	private List<Product> products;

}
