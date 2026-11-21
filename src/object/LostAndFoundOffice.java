package object;

import java.util.ArrayList;

public class LostAndFoundOffice {

    ArrayList<Object> things = new ArrayList<>();

    public boolean put(Object element) {
        return true;
    }

    public boolean check(Object target) {
        return false;
    }


}
