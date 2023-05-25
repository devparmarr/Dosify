package com.example.Dosify.Controller;


import com.example.Dosify.Model.User;
import com.example.Dosify.Service.UserService;
import com.example.Dosify.Service.impl.UserServiceImpl;
import com.example.Dosify.dto.RequestDTO.UserRequestDTO;
import com.example.Dosify.dto.ResponseDTO.UserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping("/add")
    public ResponseEntity addUser(@RequestBody UserRequestDTO userRequestDTO){
        UserResponseDTO userResponseDTO = userService.addUser(userRequestDTO);

        return new ResponseEntity(userResponseDTO, HttpStatus.CREATED);
    }
}
