package com.alicechen;


import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);



}
