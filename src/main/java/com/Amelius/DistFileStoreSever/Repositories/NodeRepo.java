package com.Amelius.DistFileStoreSever.Repositories;

import com.Amelius.DistFileStoreSever.Models.Node;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeRepo extends MongoRepository<Node,String> {

    Node findByNodeName(String nodeName);
}
