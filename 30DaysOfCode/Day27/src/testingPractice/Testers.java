package testingPractice;

import java.util.Random;

public class Testers {

    // create random trees
    // create random integers
    public static int randomInt(int min, int max){
        Random random = new Random();

        return random.nextInt((max-min) + 1) + min;
        // min = 5, max = 15
        // 15-5 = 10 + 1 = 11 --> 0 to 10
        // + 5 to this number

    }


    // random binary search tree
    public static Tree randomTree(int count){
        // if count is empty
        if (count == 0){
            return new EmptyBST();
        }else{
            return randomTree(count -1).add(randomInt(0, 50));
        }
    }

    // x + (x + 2) = x + x * 2


    public static void checkIsEmpty(Tree<Comparable> t) throws Exception {
        if (t instanceof EmptyBST){
            if (!t.isEmpty()){
                throw new Exception("All is not good. the tree is an EmptyBST and it is non-empty");
            }else if (t instanceof NonEmptyBST){
                if (t.isEmpty()){
                    throw new Exception("All is not good, the tree is a NonEmpty and it is empty");
                }
            }
        }
    }

    public static void checkAddMemberCardinality(Tree<Integer> t, int x) throws Exception{
        // cardinality of new tree

        int nT = (t.add(x)).cardinality();
        // Either something was added --> and the cardinality increased by one
        if (nT == (t.cardinality() + 1)){
            // error if the memeber is already part of the tree
            if (t.member(x)){
                throw new Exception("Cardinality increased by 1 but member already part of the tree");
            }
        }
        // OR the thing was already there and therefor not added. --> cardinality stays the same
        else if (nT == t.cardinality()){
            // if the thing added was not a member of the tree --> cardinality should go up
            if (!t.member(x)){
                throw new Exception("Cardinality didn't increase by 1 but we added a new member");
            }
        } else {
            throw new Exception("Something is wrong with our program");
        }

    }

}
