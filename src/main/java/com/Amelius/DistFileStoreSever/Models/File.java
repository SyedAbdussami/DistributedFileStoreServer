package com.Amelius.DistFileStoreSever.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class File {

    @Field("File_Id")
    private String FileId;

    @Field("File_Name")
    private String FileName;

    @Field("Owner")
    private String Owner;

    @Field("File_Type")
    private String FileType;

    @Field("File_Size")
    private long fileSize;

    @Field("Chunks")
    private List<Chunk> chunks;

    @Field("File_Description")
    private String fileDescription;
}
