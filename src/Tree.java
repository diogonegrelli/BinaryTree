public class Tree {
    Node root;

    public void insertValue(int data){
        Node newNode = new Node(data);
        if (root== null){
            root= newNode;
            return;
        }
        Node current = root;
        while (true){
            if (data > current.getData()) {
                if (current.getRight() == null) {
                    current.setRight(newNode);
                    return;
                }
                current = current.getRight();
            }
            else if (data < current.getData()) {
                if (current.getLeft() == null) {
                    current.setLeft(newNode);
                    return;
                }
                current = current.getLeft();
            }
        }
    }


    public int searchValue(int value) {
        return value;
    }

    public int removeValue(int value){
        return value;
    }


    public void printTree(){
    }
}
