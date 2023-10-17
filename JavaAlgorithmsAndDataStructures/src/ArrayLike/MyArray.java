package ArrayLike;

import java.util.ArrayList;

public class MyArray {


    public void  lookAtTheArray {
        String[] myList = new String[2];

        String a = "my what about me";
        myList[0] = a;

        String b = "Doooooooooooonnn't";
        myList[1] = b;

        int theSize = myList.length;

        String str = myList[1];

        myList[1] = null;

        boolean isIn = false;

        for (String item: myList) {
            if (b.equals(item)) {
                isIn = true;
                break;
            }
        }
    }

    public void lookatTheArrayList() {
        ArrayList<String> myList = new ArrayList<String>();

        String a = "my what about me";
        myList.add(a);

        String b = "Doooooooooooonnn't";
        myList.add(b);

        int thesize = myList.size();

        String str = myList.get(1);

        myList.remove(1);

        boolean isIn = myList.contains(b);
    }
}
