package br.univille.estd.queues.node;

import br.univille.estd.queues.Queue;

public class NodeQueue<E> implements Queue<E> {
	protected int size; 
	protected Node<E> head;
	protected Node<E> tail; 
	public NodeQueue() {
		head = null;
		tail = null;
		size = 0;
	}

	@Override
	public long size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E front() {
		// TODO Auto-generated method stub
		return null;
	}

}
