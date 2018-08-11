package com.bahaida.untracked;

import org.springframework.stereotype.Service;

//@Service
public class UntrackedServiceImpl implements UntrackedService {
    @Override
    public String sayHello() {
        return "Hello Spring";
    }
}
