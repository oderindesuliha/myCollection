public class MyArrayList {

    private int[] arrayList;
    private int count;

    public MyArrayList(int size) {
        this.arrayList = new int[size];
        this.count = 0;
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public void add(int element) {
        if(count == arrayList.length - 1){
            int[] newArray = new int[arrayList.length * count];
            for(int count = 0;count < arrayList.length;count++){
                newArray[count] = arrayList[count];
            }
            arrayList = newArray;
            arrayList[count] =  element;
            element++;

        }
        if(count >= arrayList.length) {
        }else arrayList[count] = element;
        count++;
    }
    public int size(){
        return count;
    }
    public void exception2(){

        throw new IllegalArgumentException("Arraylist is empty");}

    public boolean remove(int item) {
        for (int counter = 0; counter < count; counter++) {
            if (arrayList[counter] == item) {
                for (int index = counter; index < count - 1; index++) {
                    arrayList[index] = arrayList[index + 1];
                }
                --count;
                return true;
            }
        }
        return false;
    }
    public int get(int index){
        if(index < 0 || index >= count){
            exception2();
        }
        return arrayList[index];}
}