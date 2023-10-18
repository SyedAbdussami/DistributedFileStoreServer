package com.Amelius.DistFileStoreSever.DTO;


import com.Amelius.DistFileStoreSever.Enum.NodeStatus;
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


    private NodeStatus nodeStatus;

    private int port;

    private String address;
}
