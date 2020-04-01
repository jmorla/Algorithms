package org.algorithms.datastructures;

/**
 * @author Jorge L. Morla
 * @version v1.0
 * @param <E>
 * @since May 15, 2019
 *
 */
public class BinarySearchTree<E extends Comparable<E>> implements Tree<E> {

    /**
     * Store amount of elements in the BST
     *
     */
    private long size;

    /**
     * The first element in the tree
     *
     */
    private TreeNode<E> root;

    /**
     * Inserts an Item into the tree
     *
     * @param value
     *
     */
    @Override
    public void insert(E value) {
        if (root == NULL) {
            root = new TreeNode<>(value);
        } else {
            insertNode(root, value);
        }

        size++;
    }

    /**
     * Insert an Item in the correct order into the Tree
     *
     * @param current, The current Node
     * @param value the value to insert
     *
     */
    private void insertNode(TreeNode<E> current, E value) {

        if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == NULL) {
                current.setLeft(new TreeNode<>(value));
            } else {
                insertNode(current.getLeft(), value);
            }
        } else {
            if (current.getRight() == NULL) {
                current.setRight(new TreeNode<>(value));
            } else {
                insertNode(current.getRight(), value);
            }
        }

    }

    /**
     * Delete the first occurrence of the value e
     *
     * @param e
     *
     * Time Complexity : O(4ln(n))
     * @return
     *
     */
    @Override
    public boolean delete(E e) {

        TreeNode<E> nodeToRemove = findNode(root, e);
        if (nodeToRemove == NULL) // value is not in the BST
        {
            return false;
        }

        TreeNode<E> parent = findParent(root, e);
        if (size == 1) {
            root = null;
        } else if (nodeToRemove.getLeft() == NULL && nodeToRemove.getRight() == NULL) { //Case 1
            if (nodeToRemove.getValue().compareTo(parent.getValue()) < 0) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        } else if (nodeToRemove.getLeft() == NULL && nodeToRemove.getRight() != NULL) { //Case 2
            if (nodeToRemove.getValue().compareTo(parent.getValue()) < 0) {
                parent.setLeft(nodeToRemove.getRight());
            } else {
                parent.setRight(nodeToRemove.getRight());
            }
        } else if (nodeToRemove.getLeft() != NULL && nodeToRemove.getRight() == NULL) { //Case 3
            if (nodeToRemove.getValue().compareTo(parent.getValue()) < 0) {
                parent.setLeft(nodeToRemove.getLeft());
            } else {
                parent.setRight(nodeToRemove.getLeft());
            }
        } else { // Case 4
            TreeNode<E> largestValue = nodeToRemove.getLeft();
            while (largestValue.getRight() != NULL) {
                largestValue = largestValue.getRight();
            }

            findParent(nodeToRemove, largestValue.getValue());

            nodeToRemove.setValue(largestValue.getValue());
        }

        size--;
        return true;

    }

    /**
     * Calls the contains recursive method in order to checks if given value
     * exist
     *
     * @param e
     *
     */
    public boolean contains(E e) {
        return contains(root, e);
    }

    /**
     * Checks if value exist into the BST
     *
     */
    private boolean contains(TreeNode<E> node, E value) {

        if (node == null) {
            return false;
        }
        if (node.getValue().equals(value)) {
            return true;
        } else if (value.compareTo(node.getValue()) < 0) {
            return contains(node.getLeft(), value);
        } else {
            return contains(node.getRight(), value);
        }
    }

    /**
     * Finds a node by value and start Position node
     *
     * @param current
     * @param value
     *
     * @return {@code TreeNode<E>}
     *
     *
     */
    private TreeNode<E> findNode(TreeNode<E> current, E value) {

        if (current == NULL) {
            return null;
        }
        if (current.getValue().equals(value)) {
            return current;
        } else if (value.compareTo(current.getValue()) < 0) {
            return findNode(current.getLeft(), value);
        } else {
            return findNode(current.getRight(), value);
        }
    }

    /**
     * Finds the parent of a given value and start Position node
     *
     * @param current
     * @param value
     *
     * @return {@code TreeNode<E>}
     *
     */
    private TreeNode<E> findParent(TreeNode<E> current, E value) {

        if (current.getValue().equals(value)) {
            return null;
        }

        if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == NULL) {
                return null;
            } else if (root.getLeft().getValue().equals(value)) {
                return current;
            } else {
                return findParent(current.getLeft(), value);
            }
        } else {
            if (current.getRight() == NULL) {
                return null;
            } else if (root.getRight().getValue().equals(value)) {
                return current;
            } else {
                return findParent(current.getRight(), value);
            }
        }
    }

}
