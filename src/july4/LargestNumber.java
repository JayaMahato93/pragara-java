package july4;

public class LargestNumber {
    public static void main(String[] args) {
        int x=12;
        int y=14;
        int z=16;
        if((x>y) && (x>z)){
            System.out.println("largest number: "+x);
        } else if ((x<y) && (y>z)) {
            System.out.println(" largest number: "+y);
        }
        else if (y<z && x<z){
            System.out.println("largest number: "+z);
        }
        else {
            System.out.println("Invalid");
        }
    }
}
