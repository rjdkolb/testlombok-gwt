testlombok-gwt
==============

This is a simple Maven project to test Lombok and GWT

There is a class LombokDomainClass in the shared location that seems to compile:
```java
@Data
public class LombokDomainClass {
    private String name;
    private int age;
    
    public void someLogic(){
        this.getName();
        this.setAge(2);
    }
}
```

In TestingLombok the compile fails :
```java
  public void onModuleLoad() {
      
    LombokDomainClass domain = new LombokDomainClass();
    domain.setAge(5);
    domain.getAge();
'''
