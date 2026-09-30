public class Main {
    public static void main(String[] args) {
        opg1_3();
    }

    public static void opg1_3(){
        BinaryTree tree = new BinaryTree();
        int[] nodeValues = {60, 85, 70, 50, 55, 75, 40};
        for (int nodeValue : nodeValues) {
            tree.addValue(nodeValue);
        }
        System.out.print(tree);
    }
}