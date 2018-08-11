package com.bahaida.springplayground.config;

import com.bahaida.untracked.UntrackedService;
import com.bahaida.untracked.UntrackedServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class UntrackedConfig {

    //@Bean
    public UntrackedService untrackedService(){
        return new UntrackedServiceImpl();
    }
}
