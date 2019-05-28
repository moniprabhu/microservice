package com.stackroute.muzixapplication.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



//@Entity
@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
=======

>>>>>>> f01ba89cda443e69139f9e432d46b05431ccb29b
public class Album {
@Id
    private int trackid;
    private String trackname;
    private String trackartist;
    private String genre;


}
