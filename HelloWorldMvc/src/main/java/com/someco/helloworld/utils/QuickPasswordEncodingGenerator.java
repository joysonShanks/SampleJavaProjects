package com.someco.helloworld.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class QuickPasswordEncodingGenerator {
  
    /**
     * @param args
     */
    public static void main(String[] args) {
            String password = "joyson!!";
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            System.out.println(passwordEncoder.encode(password));
            System.out.println(passwordEncoder.matches("joyson!s!", "$2a$10$fVyHHnQfUzIAOwA9OFR.HO33N783e68nOYaAeiw.rrOknAzclZKP."));
    }
  
}
