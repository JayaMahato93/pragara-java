package august_15.staticInnerMember;

public class Bottle {
    static class Water{
        public void color(){
            System.out.println("water has no color");
        }
    }

    static void test(){
        System.out.println();
    }
}
