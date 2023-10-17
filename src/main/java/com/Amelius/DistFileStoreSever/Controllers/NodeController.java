package com.Amelius.DistFileStoreSever.Controllers;

import com.Amelius.DistFileStoreSever.Enum.NodeStatus;
import com.Amelius.DistFileStoreSever.Models.Node;
import com.Amelius.DistFileStoreSever.Repositories.NodeRepo;
import com.Amelius.DistFileStoreSever.Services.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/node")
public class NodeController {

    @Autowired
    NodeService nodeService;

    @PostMapping("/")
    public ResponseEntity<?> createNode(@RequestBody Node node){
        return new ResponseEntity<>(nodeService.registerNode(node), HttpStatus.ACCEPTED);
    }
}
