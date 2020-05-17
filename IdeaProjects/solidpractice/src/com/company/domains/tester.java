package com.company.domains;
import com.company.Interface.doing;

public class tester  extends employee implements doing {
    @Override
    public void working() {
        System.out.println("Back-end employee working");
        this.donemisson();
    }

    @Override
    public void donemisson() {
        System.out.println("This problem was done");
        Project apple = new Project("Apple",45000);
        apple.startptoject();
    }
}
