package com.indigo.flightwebapp.model;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(value="users")
@NoArgsConstructor
@Data
@Getter
@Setter
@AllArgsConstructor
public class Users {
    private String usertype;
	private String username;
	@MongoId
	private Integer userId;
	private String usermail;
	private String userphone;
	private String userpassword;

}
