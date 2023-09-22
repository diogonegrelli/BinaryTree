// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Tree tree = new Tree();


        tree.insertValue(12);
        tree.insertValue(13);
        System.out.println(tree.root.getData());
        Node var = tree.root.getRight();
        System.out.println(var.getData());
    }
}