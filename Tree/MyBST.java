public class MyBST {

    public TreeNode mRoot;

    public MyBST() {

    }

    public TreeNode insert(TreeNode root, int value)
    {
        // TH1: root == null
        if (root == null) {
            root = new TreeNode(value);
            return root;
        } else {
            TreeNode temp = root;
            while(true) {
                if (value > temp.val) {
                    if(temp.right == null) {
                        temp.right = new TreeNode(value);
                        break;
                    }else {
                        temp = temp.right;
                    }

                }else if (value < temp.val) {
                    if(temp.left == null) {
                        temp.left = new TreeNode(value);
                        break;
                    }else {
                        temp = temp.left;
                    }

                }
            }
            return root;
        }
    }

    // Tìm Node con trái cùng của root
    public TreeNode findLeftModeNode(TreeNode root) {
        if (root == null) {
            return null;
        }


        TreeNode leftModeNode = root;
        while (leftModeNode.left != null) {
            leftModeNode = leftModeNode.left;
        }

        return leftModeNode;
    }

    // xóa node key trong cây root
    // return: cây mới đã được xóa node key
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        // B1: ĐI TÌM NODE XÓA
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }else { // root.value = key ==> xoa root | xác định được node cần xoa
            // Bước 2: xóa node root

            //TH1: root là node lá:
            if (root.left == null && root.right == null) {
                return null;
            }
            // TH2: Chi co 1 con: ben trai
            if (root.left != null && root.right == null) {
                return root.left;
            }
            //TH2: Chi co 1 con: ben phai
            if (root.left == null && root.right != null) {
                return root.right;
            }
            //TH3: Ton tai 2 con
            // Tim node trai cung cua cay con ben phai

            TreeNode leftModeNode = findLeftModeNode(root.right);
            root.val = leftModeNode.val;
            root.right = deleteNode(root.right, leftModeNode.val);
        }


        return root;
    }


}
