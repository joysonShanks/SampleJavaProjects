package com.someco.helloworld.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
//@Table(name="User")
@Table(name="`USER`")
public class User implements Serializable{

	private static final long serialVersionUID = 7389856880644171123L;

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty
	@Column(name="USER_NAME", unique=true, nullable=false)
	private String userName;

	@NotEmpty
	@Column(name="FIRST_NAME", nullable=false)
	private String firstName;
	
	@NotEmpty
	@Column(name="LAST_NAME", nullable=false)
	private String lastName;
	
	@NotEmpty
	@Column(name="EMAIL", nullable=false)
	private String email;
	
	@NotEmpty
	@Column(name="PASSWORD", nullable=false)
	private String password;
	
	@NotEmpty
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="USER_USER_PROFILE", joinColumns = {@JoinColumn(name="USER_ID")}, inverseJoinColumns = {@JoinColumn(name="USER_PROFILE_ID")})
	private Set<UserProfile> userProfiles = new HashSet<UserProfile>();
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Set<UserProfile> getUserProfiles() {
        return userProfiles;
    }
 
    public void setUserProfiles(Set<UserProfile> userProfiles) {
        this.userProfiles = userProfiles;
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof User))
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (userName == null) {
            if (other.userName != null)
                return false;
        } else if (!userName.equals(other.userName))
            return false;
        return true;
	}
	
	@Override
    public String toString() {
        return "User [id=" + id + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
                + ", email=" + email + "]";
    }
}
