package com.housing.back.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.housing.back.dto.request.auth.IdCheckRequestDto;
import com.housing.back.dto.response.ResponseDto;
import com.housing.back.dto.response.auth.IdCheckResponseDto;
import com.housing.back.repoisotry.UserRepository;
import com.housing.back.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImplement implements AuthService {

    private final UserRepository userRepository;

    @Override
    public ResponseEntity<? super IdCheckResponseDto> idCheck(IdCheckRequestDto dto) {

        try {

            String userId = dto.getId();
            boolean isExistId = userRepository.existsByUserId(userId);

            if (isExistId)
                return IdCheckResponseDto.duplicateId();

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseDto.databaseError();
        }

        return IdCheckResponseDto.success();
    }

}
