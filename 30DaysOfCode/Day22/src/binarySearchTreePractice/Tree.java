package binarySearchTreePractice;

public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    //size of the tree
    public int cardinality();

    public boolean member(D elt);

    public NonEmptyBST<D> add(D elt);

}
