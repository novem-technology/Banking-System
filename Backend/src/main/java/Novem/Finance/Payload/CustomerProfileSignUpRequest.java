package Novem.Finance.Payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CustomerProfileSignUpRequest 
{

    @NotBlank
    @Size(min = 3, max = 15)
    private String username;

    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

    private String id;
	
    @NotBlank
    @Size(min = 2, max = 40)
    private String firstName;
	
	@NotBlank
    @Size(min = 2, max = 40)
	private String lastName;
	
	@NotBlank
    @Size(min = 8, max = 10)
	private String dateOfBirth;
	
	@NotBlank
    @Size(min = 4, max = 40)
	private String ssn;
	@NotBlank
    @Size(min = 4, max = 40)
	private String address1;
	
	private String address2;
	@NotBlank
    @Size(min = 4, max = 40)
	private String city;
	@NotBlank
    @Size(min = 4, max = 40)
	private String state;
	@NotBlank
    @Size(min = 4, max = 10)
	private String zip;
	
	@NotBlank
    @Size(min = 4, max = 40)
	private String phoneNumber;

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getSsn() {
		return ssn;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}
