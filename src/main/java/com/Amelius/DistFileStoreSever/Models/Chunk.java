package com.Amelius.DistFileStoreSever.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chunk {
    private String chunkId;
    private byte[] chunkData;
    private long chunkSize;
    private int order;
    private List<Node> dataNodes;
}
