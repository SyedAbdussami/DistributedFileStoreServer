package com.Amelius.DistFileStoreSever.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NodeDTO {

    private String nodeId;


    private String nodeName;


    private int capacity;


    private int fileBlocks;


    private String nodeStatus;

    private int port;

    private String address;
}
