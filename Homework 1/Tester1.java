
public class Tester1 {

    private int t1_numberOfExpressions = 3;
    private String[] t1_expressions = {"[(1*(2+3)-5)+(3+(4-5)*3)]", "[(1+2)*{3-6}/7])", "1+6^7"};

    private int t2_numberOfExpressions = 2;
    private String[] t2_expressions = {"{1+(3*5]}", "({7/3}+[2*3])"};

    private int t3_numberOfExpressions = 4;
    private String[] t3_expressions = {"[2/(8*3)-{5+7}]", "1!+4", "{1%4}", " (3-2 + {4*6})"};

    public int getNumberOfExpressions(){
        return t1_numberOfExpressions;
    }

    public String[] getExpressions(){
        return t1_expressions;
    }
}
