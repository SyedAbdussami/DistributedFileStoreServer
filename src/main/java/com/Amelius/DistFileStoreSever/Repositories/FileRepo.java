package com.Amelius.DistFileStoreSever.Repositories;


import com.Amelius.DistFileStoreSever.Models.File;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepo extends MongoRepository<File,String> {
}
