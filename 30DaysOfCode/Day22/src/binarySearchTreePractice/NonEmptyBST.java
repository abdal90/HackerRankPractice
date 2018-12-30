package binarySearchTreePractice;

public class NonEmptyBST<D extends Comparable> implements Tree<D> {

    // data
    D data;
    Tree<D> left;
    Tree<D> right;

    // constructor
    public NonEmptyBST(D elt) {
        data = elt;
        left = new EmptyBST<>();
        right = new EmptyBST<>();
    }

    // override constructor
    public NonEmptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree) {
        data = elt;
        left = leftTree;
        right = rightTree;
    }

    @Override
    public boolean isEmpty() {
        // it is not empty should return false
        return false;
    }

    @Override
    public int cardinality() {
        // recursion to check children down the ree
        return 1 + left.cardinality() + right.cardinality();
    }

    @Override
    public boolean member(D elt) {
        // if root(data) is element then return true
        if (data == elt){
            return true;
        }else{
            // check if left or right subtree
            if (elt.compareTo(data) < 0){
                return left.member(elt);
            }else {
                return right.member(elt);
            }
        }
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
        // if element is already in the tree
        if (data == elt){
            return this;
        } else {
            // if element is less than data the put in left subtree
            if (elt.compareTo(data) < 0){
                return new NonEmptyBST<>(data, left.add(elt), right);
            }else{
                // if element is greater than subtree put in the right subtree
                return new NonEmptyBST<>(data, left, right.add(elt));
            }
        }
    }
}
