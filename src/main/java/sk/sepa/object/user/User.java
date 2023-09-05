package sk.sepa.object.user;

import jakarta.persistence.*;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ime;
	private String prezime;
	private String email;
	private String password;
	private int dob;
	private String lokacija;
	private String roles;
	private String username;
	private int br_blagajne;
	
	
	
	public User(Long id, String ime, String prezime, String email, String password, int dob, String lokacija,
                String roles, String username, int br_blagajne) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.lokacija = lokacija;
		this.roles = roles;
		this.username = username;
		this.br_blagajne= br_blagajne;
	}
	

	public User() {
		super();
	}

	public int getBrBlagajne() {
		return br_blagajne;
	}

	public void setBrBlagajne(int br_blagajne) {
		this.br_blagajne = br_blagajne;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getLokacija() {
		return lokacija;
	}
	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
