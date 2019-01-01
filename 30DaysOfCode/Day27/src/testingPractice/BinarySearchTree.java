package testingPractice;

public class BinarySearchTree {

    public static void main(String[] args) throws Exception {

        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(5);


        Testers.checkAddMemberCardinality(e, 5);
        Testers.checkAddMemberCardinality(n, 5); // cardinality should not increase
        Testers.checkAddMemberCardinality(n, 6); // should increase by 1

        int tests = 1000;
        for (int i = 0; i < tests; i++) {
            Tree t;
            if (i % 10 == 0){
                t = Testers.randomTree(0);
            }else {
                t = Testers.randomTree(10);
            }
            Testers.checkAddMemberCardinality(t, i);

        }

    }
}
