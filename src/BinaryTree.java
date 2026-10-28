public class BinaryTree {
    public Node root;

    // Constructor
    public BinaryTree(){root = null;}

    public void addNode(Node node) {
        if (root == null)
        {
            root = new Node(node);
        }
        else
        {
            root.AddChildNode(node);
        }
    }
}
