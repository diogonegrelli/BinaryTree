public class Tree {
    Node root;
    public void insertValue(int data){
        if (root == null){
            root = new Node(data);}
        else{
            Node newNode = new Node(data);
            Node current = root;
         /*   while (current!=null)
                if (data > current.getData()) {
                    current = current.getRight();}
                else{
                    current = current.getLeft();
                }*/
            if (data > current.getData()){
                    current.setRight(newNode);}
            else {
                current.setLeft(newNode);}
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
