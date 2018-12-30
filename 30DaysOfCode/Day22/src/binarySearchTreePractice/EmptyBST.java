package binarySearchTreePractice;

public class EmptyBST<D extends Comparable> implements Tree<D>{

    // empty constructor
    public EmptyBST() {
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(D elt) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D elt) {
        // create a new non empty BST
        return new NonEmptyBST<>(elt);
    }
}
