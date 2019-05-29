package com.stackroute.muzixapplication.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



//@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
<<<<<<< HEAD
@Document(collection = "musicdb")
=======
>>>>>>> d38d0d7f3fcec18248976b372c587dd5cee45bc8
public class Album {
@Id
    private int trackid;
    private String trackname;
    private String trackartist;
    private String genre;
}
