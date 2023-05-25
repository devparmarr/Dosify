package com.example.Dosify.Service;

import com.example.Dosify.Model.User;
import com.example.Dosify.dto.RequestDTO.UserRequestDTO;
import com.example.Dosify.dto.ResponseDTO.UserResponseDTO;
import org.springframework.stereotype.Service;


public interface UserService {
    UserResponseDTO addUser(UserRequestDTO userRequestDTO);
}
