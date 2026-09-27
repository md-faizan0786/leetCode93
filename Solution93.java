
public class Solution93 {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }


    int dia = 0;
    public int height(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        dia = Math.max(lh + rh, dia);

        return Math.max(lh, rh) +1;
    }

    public int diameterOfBinaryTree(TreeNode root){
        if(root == null) {
            return 0;
        }

        int h = height(root);

        return dia;
    }

    public static void main(String[] args) {
        Solution93 solution93 = new Solution93();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int diameter = solution93.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree: " + diameter);
    }
}
