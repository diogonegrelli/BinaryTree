public class Tree {
    Node root;
    public void insertValue(int data){
        if (root == null){
            root = new Node(data);
        }
        else{
            Node newNode = new Node(data);
            Node current = root;
            if (data > root.getData())
                root.setRight(newNode);


        }
    }

    public int searchValue(int value){
        return value;
    };

    public int removeValue(int value){
        return value;
    }


    public void printTree(){

    }
}
