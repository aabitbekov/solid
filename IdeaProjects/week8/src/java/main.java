package java;

import java.domins.AnotherFilter;
import java.domins.ServletFilter;

public class main {
    public static void main(String[] args) {
        FilterFactory filter = new FilterFactory();

        ServletFilter servletFilter = new ServletFilter();
        AnotherFilter anotherFilter = new AnotherFilter();

        servletFilter.Filtred();
        anotherFilter.Filtred();
    }
}
