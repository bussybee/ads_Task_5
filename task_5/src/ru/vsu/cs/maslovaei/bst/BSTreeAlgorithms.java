package ru.vsu.cs.maslovaei.bst;

import ru.vsu.cs.maslovaei.BinaryTree;

public class BSTreeAlgorithms {

    /**
     * Поиск TreeNode по значению в поддереве node
     *
     * @param node Узел дерева
     * @param value Значение для поиска
     * @return Узел, содержащий искомый элемент
     */
    public static <T extends Comparable<? super T>> BinaryTree.TreeNode<T> getNode(BinaryTree.TreeNode<T> node, T value) {
        if (node == null) {
            return null;
        }
        int cmp = node.getValue().compareTo(value);
        if (cmp == 0) {
            return node;
        } else if (cmp > 0) {
            return getNode(node.getLeft(), value);
        } else {
            return getNode(node.getRight(), value);
        }
    }

    /**
     * Поиск минимального TreeNode в поддереве node
     *
     * @param node Поддерево в котором надо искать минимальный элемент
     * @return Узел, содержащий минимальный элемент
     */
    public static <T extends Comparable<? super T>> Integer getMinNode(BinaryTree.TreeNode<Integer> node) {
        if (node == null) {
            return null;
        }
        Integer minValue = node.getValue();
        while (node.getLeft() != null) {
            if (minValue > node.getLeft().getValue()) {
                minValue = node.getLeft().getValue();
            }
            node = node.getLeft();
        }
        return minValue;
    }
}
