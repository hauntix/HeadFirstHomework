package p14;

public class Main {
    public static void main(String[] args) {
        int bugNum = 99;
        String word = "bugs";

        while(bugNum > 0){

            System.out.println(bugNum + " annoying ass " + word + " in the code");

            System.out.println(bugNum + " annoying ass " + word + ".");
            System.out.println("Take one down.");
            System.out.println("Patch it around.");

            bugNum--;

            if(bugNum == 1)
                word = "bug";

            if(bugNum > 0){
                System.out.println(bugNum + " annoying ass " + word + " in the code");
            } else {
                System.out.println("No more annoying ass bugs in the code!");
            }

        }
    }
}
