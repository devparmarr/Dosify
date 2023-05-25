package com.example.Dosify.Service.impl;

import com.example.Dosify.Model.User;
import com.example.Dosify.Repository.UserRepository;
import com.example.Dosify.Service.UserService;
import com.example.Dosify.dto.RequestDTO.UserRequestDTO;
import com.example.Dosify.dto.ResponseDTO.UserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;


    @Override
    public UserResponseDTO addUser(UserRequestDTO userRequestDTO){

        User user = new User();
        user.setName(userRequestDTO.getName());
        user.setAge(userRequestDTO.getAge());
        user.setEmailId(userRequestDTO.getEmailId());
        user.setMobNo(userRequestDTO.getMobNo());
        user.setGender(userRequestDTO.getGender());

        User savedUser = userRepository.save(user);

        UserResponseDTO userResponseDTO= new UserResponseDTO();

        userResponseDTO.setName(savedUser.getName());
        userResponseDTO.setMessage("Congrats! You have Registered to Dosify");

        return userResponseDTO;
    }
}
