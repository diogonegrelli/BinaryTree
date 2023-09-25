import java.util.Scanner;

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
            if (data >= current.getData()) {
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


    public void searchValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor a ser pesquisado na árvore: ");
        int value = scanner.nextInt();
        scanner.close();
        boolean valueFound = searchRecursive(root, value);

        if (valueFound){
            System.out.println("Valor "+value+" encontrado na árvore");
        }else {
            System.out.println("Valor "+value+" não encontrado na árvore!");
        }
    }

    private boolean searchRecursive(Node node, int targetValue){
        if (node == null) {return false;}
        if (targetValue == node.getData()) {
            return true;
        } else if (targetValue < node.getData()) {
            return searchRecursive(node.getLeft(), targetValue);
        } else {
            return searchRecursive(node.getRight(), targetValue);
        }
    }

    public Node min(Node x) {
        if (x == root){
            x = root;
        }
        while(x.getLeft() != null){
            x = x.getLeft();
        }
        return x;
    }

    public Node removeValue(Node x, int data){
        if (x == root){
            x = root;
        }
        if (x == null){
            System.out.println("Valor " + data + " não encontrado na árvore!");
            return x;
        }
        if (data < x.getData()){
            x.setLeft(removeValue(x.getLeft(), data));
        } else if (data > x.getData()){
            x.setRight(removeValue(x.getRight(), data));
        }else{
            if (x.getLeft() == null){
                return x.getRight();
            }
            else if (x.getRight() == null)
                return x.getLeft();
            else{
                Node sub = min(x.getRight());
                x.setData(sub.getData());
                x.setRight(removeValue(x.getRight(), sub.getData()));
            }
        }
        return x;

    }
    public void removeAndPrint(int data) {
        root = removeValue(root, data);
        System.out.println("Valor " + data + " removido com sucesso!");
        System.out.println("Raiz da árvore após a remoção: " + root.getData());
    }


    public void printTree() {
        printTree(root, "", false);
    }

    private void printTree(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.getData());
            printTree(node.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
            printTree(node.getRight(), prefix + (isLeft ? "│   " : "    "), false);
        }
    }
}

