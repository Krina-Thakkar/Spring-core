package com.company.kt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// configure the bean inside Java class

// It will create object for class that has @Component
@Component   // if I am not mentioning beanID in @Component (eg. @Component("collegeBean")); it will take default as class name(first letter lower case). Here our beanID would be college
public class College {

    @Value("${college.Name}")
    private String collegeName;

    @Autowired  // it will inject principal object to this dependency
    private Principal principal;

    @Autowired // it will inject object to this dependency but which object?? Teacher interface has MathTeacher and ScienceTeacher class implementation
    @Qualifier("scienceTeacher") // it will inject scienceTeacher object
    private Teacher teacher;

   /* public College(){

    }
    public College(Principal principal) {
        this.principal = principal;
    }
*/

  /*  public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }*/

    public void test(){
        principal.principalInfo();
        teacher.teach();
        System.out.println("My college name is "+collegeName);
        System.out.println("testing...");
    }
}

// To need a college object; we will need a principal object as Principal is a dependency of College

// Thus, there are 3 ways to create Beans
// 1) using xml file
// 2) creating config class in Java and using @Component above individual class and using @Autowired to inject dependency
// 3) creating config class in Java and using @Beans above the methods that returns object of that class