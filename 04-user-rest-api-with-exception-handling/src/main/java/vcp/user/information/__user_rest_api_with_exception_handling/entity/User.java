package vcp.user.information.__user_rest_api_with_exception_handling.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Column(name="user_id")
	private Integer userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_contact")
	private Long userContact;
	
	@Column(name="user_email")
	private String userEmail;

}
