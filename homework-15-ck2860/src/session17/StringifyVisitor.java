package session17;

public class StringifyVisitor implements Visitor{
    private  StringBuilder builder;

    public StringifyVisitor(){
        builder = new StringBuilder();
    }

    public void clear(){
        builder = new StringBuilder();
    }

    @Override
    public void visit(BinaryNode node) {
        if(node != null){
            builder.append(node.getValue());
            builder.append(" ");
        }
    }

    @Override
    public String toString() {
        return builder.toString();
    }


}
