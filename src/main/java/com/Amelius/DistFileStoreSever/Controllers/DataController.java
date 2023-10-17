package com.Amelius.DistFileStoreSever.Controllers;


import com.Amelius.DistFileStoreSever.DTO.UserRequest;
import com.Amelius.DistFileStoreSever.DTO.UserResponse;
import com.Amelius.DistFileStoreSever.Services.DataService;
import com.Amelius.DistFileStoreSever.Services.NodeService;
import com.Amelius.DistFileStoreSever.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/data")
public class DataController {

//    @Autowired
//    UserService userService;
//
//    @Autowired
//    NodeService nodeService;

    @Autowired
    DataService dataService;

//    @GetMapping("/file")
//    public ResponseEntity<UserResponse> getFile(){
//        UserResponse userResponse=
//        return new ResponseEntity<>();
//    }

    @PostMapping("/")
    public ResponseEntity<UserResponse> uploadFile(@RequestParam("File") MultipartFile userFile,@RequestParam("UserId") String userId, @RequestHeader("Authorization") String token){
        UserResponse userResponse =dataService.uploadFile(userFile,userId,token.substring(7));
        return new ResponseEntity<>(userResponse, HttpStatus.ACCEPTED);

    }
}
