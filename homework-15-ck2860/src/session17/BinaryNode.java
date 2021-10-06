package session17;

public class BinaryNode {
    private int value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public void prefixTraversal(Visitor visitor) {

        //visit this node
        visitor.visit(this);


        //if the left subtree is not empty,
        //traverse the left subtree
        if(left != null) {
            left.prefixTraversal(visitor);
        }


        //if the right subtree is not empty,
        //traverse the right subtree
        if(right != null) {
            right.prefixTraversal(visitor);
        }
    }


    public void infixTraversal (Visitor visitor){
        // if the left subtree is not empty,
        // traverse the left subtree
        if (left != null){
            left.infixTraversal(visitor);
        }
        // visit this node
        visitor.visit(this);

        // if the right subtree is not empty.
        // transverse the right subtree
        if(right != null) {
        right.infixTraversal(visitor);
        }
    }


//    public boolean search(int target){
//        return (value == target) || (left != null && left.search(target)) || (right != null && right.search(target));
//    }

    public boolean search (int target){
        if(target == value){
            return true;
        }else if(left != null && left.search(target)){
            return true;
        }else if(right != null && right.search(target)) {
            return true;
        }
        return false;
    }

    public void binaryInsert(int value){
        if (value < this.value){
            if(left == null){
                left = new BinaryNode(value);
            }else{
                left.binaryInsert(value);
            }
        } else {
            if(right == null){
                right = new BinaryNode(value);
            }else {
                right.binaryInsert(value);
            }
        }
    }

    public boolean binarySearch(int target){
        if(this.value == target){
            return true;
        }else if (target < this.value && left !=null){
            return left.binarySearch(target);
        }else if (right != null){
            return right.binarySearch(target);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        BinaryNode root  = new BinaryNode(2);

        root.setLeft( new BinaryNode(3));
        root.getLeft().setLeft(new BinaryNode(9));
        root.getLeft().setRight(new BinaryNode(4));

        root.setRight(new BinaryNode(7));
        root.getRight().setRight(new BinaryNode(1));
        root.getRight().setRight(new BinaryNode(6));

        root.getLeft();


        System.out.println("Contains 5: "+ root.search(5) );
        System.out.println("Contains 6: " + root.search(6));

        System.out.println("Contains 5: "+ root.binarySearch(5) );
        System.out.println("Contains 6: " + root.binarySearch(6));
        System.out.println("Contains 7: " + root.binarySearch(7));



        StringifyVisitor visitor = new StringifyVisitor();
        root.infixTraversal(visitor);
        System.out.println(visitor);

        visitor.clear();

        BinaryNode bst = new BinaryNode(9);
        bst.binaryInsert(3);
        bst.binaryInsert(5);
        bst.binaryInsert(2);
        bst.binaryInsert(6);

        visitor.clear();
        bst.infixTraversal(visitor);
        System.out.println(visitor);
        visitor.clear();
        BinaryNode Pikachu  = new BinaryNode(25);
        Pikachu.binaryInsert(1);
        Pikachu.binaryInsert(3);
        Pikachu.binaryInsert(4);
        Pikachu.binaryInsert(6);
        Pikachu.binaryInsert(7);
        Pikachu.binaryInsert(9);
        Pikachu.binaryInsert(22);
        Pikachu.binaryInsert(11);
        Pikachu.binaryInsert(20);
        Pikachu.infixTraversal(visitor);
        System.out.println(visitor);

    }
}