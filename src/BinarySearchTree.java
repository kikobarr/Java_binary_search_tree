
public class BinarySearchTree<Item> {
    Node<Item> root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(String key, Item data) {
        root = treeEnter(root, key, data); // when the root is null, root gets assigned with Node newOne
        // ... does that really add it?
    }

    public Node<Item> treeEnter(Node<Item> root, String key, Item data) {

        if (root == null) {
            Node<Item> nodeToAdd = new Node<Item>();
            nodeToAdd.key = key;
            nodeToAdd.data = data;
            nodeToAdd.leftChild = nodeToAdd.rightChild = null;
            return nodeToAdd;
        } else if (key.compareTo(root.key) < 0) {
            root.leftChild = treeEnter(root.leftChild, key, data);
        } else if (key.compareTo(root.key) > 0) {
            root.rightChild = treeEnter(root.rightChild, key, data);
        } else {
            root.data = data;
        }
        return root;
    }

    public Item getValue(String key) throws MyException {
        Node<Item> found = treeSearch(root, key);
        if (found != null)
            return found.data;
        else
            throw new MyException("Key not found");

    }

    private Node<Item> treeSearch(Node<Item> node, String key) {
        if (node == null) {
            return null;
        }
        if (key.compareTo(node.key) < 0) {
            System.out.println("Searching left");
            return treeSearch(node.leftChild, key);
        } else if (key.compareTo(node.key) > 0) {
            System.out.println("Searching right");
            return treeSearch(node.rightChild, key);
        } else {
            return node;
        }
    }

    public Item FindMin() throws MyException {
        if (root == null) {
            throw new MyException("Tree is empty");
        }
        Node<Item> minNode = FindMinNode(root);
        return minNode.data;
    }

    private Node<Item> FindMinNode(Node<Item> root) {
        // recurse down the left branches until you reach leftmost leaf node
        // return the value in that node
        if (root.leftChild == null) {
            return root;
        }
        return FindMinNode(root.leftChild);
    }

    public Item FindMax() throws MyException {
        if (root == null) {
            throw new MyException("Tree is empty");
        }
        Node<Item> maxNode = FindMaxNode(root);
        return maxNode.data;
    }

    private Node<Item> FindMaxNode(Node<Item> root) {
        // recurse down the right branches until you reach rightmost leaf node
        // return the value in that node
        if (root.rightChild == null) {
            return root;
        }
        return FindMaxNode(root.rightChild);
    }


    public void display() {
        displayNodes(root);
    }

    private void displayNodes(Node<Item> root) {
        if (root != null) {
            displayNodes(root.leftChild);
            System.out.println(root.data);
            displayNodes(root.rightChild);
        }
    }

    public void Load(Node<Item>[] array) {
        root = LoadArray(array, 0, array.length - 1);
    }

    private Node<Item> LoadArray(Node<Item>[] array, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node<Item> node = array[mid];
        node.leftChild = LoadArray(array, start, mid - 1);
        node.rightChild = LoadArray(array, mid + 1, end);
        return node;
    }

}