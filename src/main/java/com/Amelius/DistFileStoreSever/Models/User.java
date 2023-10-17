package com.Amelius.DistFileStoreSever.Models;


import com.Amelius.DistFileStoreSever.Enum.NodeStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @Field("User_ID")
    private String nodeId;

    @Field("User_Name")
    @Indexed(unique = true)
    private String userName;

    @Field(name = "Password")
    private String password;

    @Field(name = "FirstName")
    private String firstName;

    @Field(name="LastName")
    private String lastName;
}
