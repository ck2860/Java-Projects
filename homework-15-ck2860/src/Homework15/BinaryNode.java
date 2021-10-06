package Homework15;

public class BinaryNode <T> {
    /**
     * value for the value.
     * left is for the left subtree
     * right is for the right subtree
     */
    private T value;
    private BinaryNode left;
    private BinaryNode right;
    private PokemonComparator<T> pokemonComparator;

    /**
     * the constructor takes an int value and pokemon comparator
     * set left and right subtrees as null at first.
     */
    public BinaryNode(T value, PokemonComparator<T> pokemonComparator) {
        this.value = value;
        left = null;
        right = null;
        this.pokemonComparator = pokemonComparator;
    }

    /**
     * Adding a constructor that only takes a value without a comparator.
     * assigning a value of null to the comparator field.
     * @param value any value
     */

    public BinaryNode(T value) {
        this.value = value;
        left = null;
        right = null;
        this.pokemonComparator = null;
    }


    /**
     * a getter for its int value
     *
     * @return its value
     */

    public T getValue() {
        return value;
    }

    /**
     * a setter for its int value
     *
     * @param value int value
     */

    public void setValue(T value) {
        this.value = value;
    }

    /**
     * a getter for its left subtree
     *
     * @return left subtree
     */

    public BinaryNode getLeft() {
        return left;
    }

    /**
     * a setter for its left subtree
     *
     * @param left subtree
     */

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    /**
     * a getter for its right subtree
     *
     * @return right subtree
     */

    public BinaryNode getRight() {
        return right;
    }

    /**
     * a setter for its right subtree
     *
     * @param right subtree
     */

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    /**
     * Traverse the root first then traverse into the left sub-tree
     * and right subtree respectively.
     *
     * @param visitor
     */

    public void prefixTraversal(Visitor visitor) {

        //visit this node
        visitor.visit(this);

        //if the left subtree is not empty,
        //traverse the left subtree
        if (left != null) {
            left.prefixTraversal(visitor);
        }

        //if the right subtree is not empty,
        //traverse the right subtree
        if (right != null) {
            right.prefixTraversal(visitor);
        }
    }

    /**
     * perform an infix traversal of the binary tree
     * traverse a tree.
     *
     * @param visitor
     */
    public void infixTraversal(Visitor visitor) {
        if (left != null) {
            left.infixTraversal(visitor);
        }
        visitor.visit(this);

        if (right != null) {
            right.infixTraversal(visitor);
        }
    }

    /**
     * traverse the left subtree and then transverse the right subtree then root.
     *
     * @param visitor
     */

    public void postfixTraversal(Visitor visitor) {

        //if the left subtree is not empty,
        //traverse the left subtree
        if (left != null) {
            left.postfixTraversal(visitor);
        }

        //if the right subtree is not empty,
        //traverse the right subtree
        if (right != null) {
            right.postfixTraversal(visitor);
        }

        //visit this node
        visitor.visit(this);
    }

    /**
     * If the value matches the target, return true.
     * we would search the left subtree first then return true if the target is found.
     * If not, then search the right subtree then return true if the target is found.
     * otherwise, return false
     *
     * @param target the value that you want to look for
     * @return boolean value
     */

    public boolean search(T target) {
        return (value == target) ||
                (left != null && left.search(target)) ||
                (right != null && right.search(target));
    }

    /**
     * Implementing insert method in order to insert a new value
     * into the correct place in the tree.
     * When the new value comes before value, insert the new value into the
     * left subtree. Otherwise, insert the new value into the right subtree.
     * repeat until an empty subtree is found.
     * create a new binary node and add it to new tree.
     */

//    public void binaryInsert(T value) {
//        if (pokemonComparator.compare(value, this.value) < 0) {
//            if (left == null) {
//                left = new BinaryNode(value, pokemonComparator);
//            } else {
//                left.binaryInsert(value);
//            }
//        } else {
//            if (right == null) {
//                right = new BinaryNode(value, pokemonComparator);
//            } else {
//                right.binaryInsert(value);
//            }
//        }
//    }

        public void binaryInsert(T value) {
        if (compare(value, this.value) < 0) {
            if (left == null) {
                left = new BinaryNode(value, pokemonComparator);
            } else {
                left.binaryInsert(value);
            }
        } else {
            if (right == null) {
                right = new BinaryNode(value, pokemonComparator);
            } else {
                right.binaryInsert(value);
            }
        }
    }

    //
//    /**
//     * search for a target value in the tree
//     * if the value matches the target, return true.
//     * if the target is less than value, search the left subtree
//     * return false if the left subtree is null or search the right subtree and return false if the right subtree is null.
//     *
//     * @param target
//     * @return
//     */
//
//    public boolean binarySearch(int target) {
//        if (pokemonComparator.compare(value, target) == 0) {
//            return true;
//        } else if (pokemonComparator.compare(value, target) < 0 && left != null) {
//            return left.binarySearch(target);
//        } else if (right != null) {
//            return right.binarySearch(target);
//        } else {
//            return false;
//        }
//    }

    public boolean binarySearch( T target){
        if (compare(this.value, target) == 0) {
            return true;
        } else if (compare(this.value, target) > 0 && left != null) {
            return left.binarySearch(target);
        } else if (compare(value, target) < 0 && right != null) {
            return right.binarySearch(target);
        } else {
            return false;
        }
    }



    /**
     * Comparing two instances of the generic types then use comparator
     * to compare the two instances if they are not null.
     * However, case both a and b intro instances of the comparable interface  and use compareTo method.
     *
     */

    public int compare (T a, T b){
        if (pokemonComparator != null) {
            return pokemonComparator.compare(a, b);
        }else{
//            Comparable<T> ca = (Comparable<T>)a;
           return ((Comparable<T>) a).compareTo((T) b);
        }
    }


    /**
     * a main method to build the binary tree
     *
     * @param args
     */

    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(2);

        root.setLeft(new BinaryNode(3));
        root.getLeft().setLeft(new BinaryNode(9));
        root.getLeft().setRight(new BinaryNode(4));

        root.setRight(new BinaryNode(7));
        root.getRight().setLeft(new BinaryNode(1));
        root.getRight().setRight(new BinaryNode(6));
//
//
//
//        System.out.println("Contains 5: " + root.search(5));
//        System.out.println("Contains 6: " + root.search(6));
//

        StringifyVisitor visitor = new StringifyVisitor();
        root.infixTraversal(visitor);
        System.out.println("infix-traversal:" + visitor);

        visitor.clear();
        root.prefixTraversal(visitor);
        System.out.println("prefix-traversal"+visitor);

        visitor.clear();
        root.postfixTraversal(visitor);
        System.out.println("postfix-traversal"+visitor);
//
//        BinaryNode bst = new BinaryNode(9);
//        bst.binaryInsert(3);
//        bst.binaryInsert(4);
//        bst.binaryInsert(2);
//        bst.binaryInsert(1);
//        bst.binaryInsert(7);
//        bst.binaryInsert(6);
//
//        visitor.clear();
//        bst.infixTraversal(visitor);
//        System.out.println(visitor);
//
//        System.out.println("Contains 5: " + bst.binarySearch(5));
//        System.out.println("Contains 6: " + bst.binarySearch(6));
    }
}
