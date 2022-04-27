public class Tester2 {

    private int t1_numberOfStrings = 2;
    private String[] t1_strings = {"ababbcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"};

    private int t2_numberOfStrings = 3;
    private String[] t2_strings = {"asdfjkljerb", "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz", "qwertnsadfhje"};

    private int t3_numberOfStrings = 1;
    private String[] t3_strings = {"aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz"};

    public int getNumberOfStrings(){
        return t1_numberOfStrings;
    }

    public String[] getStrings(){
        return t1_strings;
    }
}
