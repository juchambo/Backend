package ar.com.porfolio.Backend.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String Email;
    private String password;

    public LoginDto(String Email, String password) {
        this.Email = Email;
        this.password = password;
    }

    public LoginDto() {
    }
    
    
}