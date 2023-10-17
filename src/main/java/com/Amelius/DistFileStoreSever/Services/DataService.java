package com.Amelius.DistFileStoreSever.Services;

import com.Amelius.DistFileStoreSever.DTO.UserRequest;
import com.Amelius.DistFileStoreSever.DTO.UserResponse;
import com.Amelius.DistFileStoreSever.Models.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class DataService {

    @Autowired
    NodeService nodeService;

    public void getFile(String userId,String fileName){
        // userId+ FileId(FileName)= list of fileChunks.
        //Fetch all fileChunks from the nodes
        //reconstruct file.
    }

    public UserResponse uploadFile(MultipartFile userFile, String userId, String userToken){
        //get FileName, divide file into blocks
        //randomly select node and send it via kafka.(FileChunkId+NodeId)
        //{success:true,FileChunks:[FileChunks]}
        return new UserResponse();
    }

    public void splitFile(MultipartFile userFile){
        //
    }

    public void reconstructFile(File file){

    }


    //{}
}
