package java;

import java.Type.Types;
import java.domins.AnotherFilter;
import java.domins.ServletFilter;
import java.interfaces.Filter;

public class FilterFactory {
    public Filter getFilter(Types type){
        Filter  toReturn = null;
        switch (type) {
            case ServletFilter:
                toReturn = new ServletFilter();
                break;
            case AnotherFilter:
                toReturn = new AnotherFilter();
                break;
            default:
                throw new IllegalArgumentException("Wrong doughnut type:" + type);
        }
        return toReturn;
    }
}
