package Tree;

/**
 * @Author: Chuang
 * @Date: 2020/4/26 16:31
 */

class BiNode<T> {
    BiNode(T t){
        data = t;
    }
    T data;
    BiNode leftChild;
    BiNode rightChild;
}
