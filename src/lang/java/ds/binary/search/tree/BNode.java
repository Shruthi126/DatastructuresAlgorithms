package lang.java.ds.binary.search.tree;


public class BNode<T> {

	private int key;
	private T value;
	private BNode<T> rightChild;
	private BNode<T> leftChild;
	
	public BNode (int key,T value){
		this.key=key;
		this.value=value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public BNode<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(BNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	public BNode<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(BNode<T> leftChild) {
		this.leftChild = leftChild;
	}
}
