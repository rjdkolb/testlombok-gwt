package org.openrap.testlombok.shared;

import lombok.Data;

@Data
public class LombokDomainClass {
    private String name;
    private int age;
    
    public void someLogic(){
        this.getName();
        this.setAge(2);
    }
}
