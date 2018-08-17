package com.bahaida.untracked;

public interface UntrackedService {
    default String sayHello(){
        return "Hello Spring";
    }
}
