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

    public Node min(Node x) {
        if (x == root){
            x = root;
        }
        while(x.getLeft() != null){
            x = x.getLeft();
        }
        return x;
    }

    public Node max(Node x) {
        if (x == root){
            x = root;
        }
        while (x.getRight() != null){
            x = x.getRight();
        }  
        return x;
        //talvez tenha problema no retorno ja que X é o nó e estamos interessados apenas no valor dado (atributo data)
    }

    public Node removeValue(Node x, int data){
        if (x == root){
            x = root;
        }
        if (x == null){
            return x;
        }
        //se o valor for menor que o valor do nó que está olhando, vai descer a esquerda e substituir todos que estão
        //a esquerda pelo retorno desta função tentando remover este mesmo valor do nó a esquerda e faz o mesmo a direita
        if (data < x.getData()){
            x.setLeft(removeValue(x.getLeft(), data));//set por que está sendo atualizado a referencia do pai do nó
        } else if (data > x.getData()){
            x.setRight(removeValue(x.getRight(), data));
        }
        else{
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


    public void printTree(){
    }
}
