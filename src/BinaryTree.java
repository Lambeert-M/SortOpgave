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
    // Tree-printing method generated with Claude (Anthropic), adapted for this project
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        print(root, 0, sb);
        return sb.toString();
    }

    private void print(Node node, int depth, StringBuilder sb) {
        if (node == null) return;
        print(node.right, depth + 1, sb);
        sb.append("    ".repeat(depth)).append(node.nodeValue).append("\n");
        print(node.left, depth + 1, sb);
    }
}
