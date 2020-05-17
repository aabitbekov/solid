package com.company.domains;

import com.company.Interface.doing;

public class backenders extends employee implements doing {

    @Override
    public void working() {
        System.out.println("Back-end employee working");
        donemisson();
    }

    @Override
    public void donemisson() {
        System.out.println("This problem was done,next step front end");
        frontenders frontender = new frontenders();
        frontender.working();
    }
}