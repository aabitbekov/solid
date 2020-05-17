package com.company.domains;

import com.company.Interface.doing;

public class frontenders extends employee implements doing {
    @Override
    public void working() {
        System.out.println("Front-end employee working");
        donemisson();
    }

    @Override
    public void donemisson() {
        System.out.println("This problem was done,next step testers");
        tester tester = new tester();
        tester.working();


    }
}
