public class BinaryTree {
    public Node root;

    // Constructor
    public BinaryTree(){root = null;}

    public void addValue(int value) {
        if (root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.AddChildNode(value);
        }
    }
}
