package com.Amelius.DistFileStoreSever.Services;

import com.Amelius.DistFileStoreSever.DTO.NodeDTO;
import com.Amelius.DistFileStoreSever.Exception.CustomException;
import com.Amelius.DistFileStoreSever.Models.Node;
import com.Amelius.DistFileStoreSever.Repositories.NodeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class NodeService {

    @Autowired
    NodeRepo nodeRepo;

    ModelMapper mapper=new ModelMapper();

    public NodeDTO registerNode(Node node){
        verifyNodeCreated(node.getNodeName());
        nodeRepo.save(node);
        return mapper.map(node,NodeDTO.class);
    }

    public void verifyNodeCreated(String nodeName){
        Node claimedNode=nodeRepo.findByNodeName(nodeName);
        if(claimedNode!=null){
            throw new CustomException("Node already registered","Try again with a new name", HttpStatus.BAD_REQUEST);
        }
    }
}
