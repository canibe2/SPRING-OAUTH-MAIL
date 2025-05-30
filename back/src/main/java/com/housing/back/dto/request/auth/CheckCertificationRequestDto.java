package com.housing.back.dto.request.auth;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CheckCertificationRequestDto {

    @NotBlank
    private String id;

    @NotBlank
    private String email;

    @NotBlank
    private String certificationNumber;

}
