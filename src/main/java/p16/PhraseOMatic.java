package p16;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {
                "linen", "daughter", "lyrical", "rapid",
                "acceptable","spy","weather","hot",
                "cactus","fire","sloppy","steer"
        };

        String[] wordListTwo = {
                "regret", "inject", "interest", "accessible",
                "channel","coat","baseball","fantastic",
                "joyous","wax","instruct","hang", "unequal",
                "shirt", "guttural","halting","time","haunt"
        };

        String[] wordListThree = {
                "drunk", "houses", "endurable", "crib",
                "long-term","zippy","receptive","elastic",
                "trace","careful","toe","jump"
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need is a "+phrase);
    }
}
