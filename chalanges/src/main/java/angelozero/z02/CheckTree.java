package angelozero.z02;

public class CheckTree {
    public static void main(String[] args) {
        System.out.println(checkTree(new TreeNode()));
    }

    public static boolean checkTree(TreeNode root) {
        if (root != null && root.left != null && root.right != null) {
            return root.val == sum(root.left.val, root.right.val);
        }
        return false;
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}