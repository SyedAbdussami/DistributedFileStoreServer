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
public class Node {
    @Id
    @Field("Node_Id")
    private String nodeId;

    @Field("Node_Name")
    @Indexed(unique = true)
    private String nodeName;

    @Field("Storage_Capacity")
    private int capacity;

    @Field("Number_of_Blocks")
    private int fileBlocks;

    @Field("Node_Status")
    private NodeStatus nodeStatus;

    @Field("Port")
    @Indexed(unique = true)
    private int port;

    @Field("Address")
    private String address;
}
