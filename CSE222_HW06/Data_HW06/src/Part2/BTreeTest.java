package Part2;

import static org.junit.Assert.*;

public class BTreeTest {

    @org.junit.Test
    public void binarySearch() {
    int size = 3;
    int item = 13;
    int flag=0;
    Integer [] data = new Integer[3];
    data[0] = 12;
    data[1] = 13;
    data[2] = 14;
        for(int i=0; i < size; ++i){
            if(item == (data[i])  || item == (data[i])){
                flag = i;
            }
        }

    }
}