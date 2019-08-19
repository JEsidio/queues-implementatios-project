package br.univille.estd.queues.array;

import br.univille.estd.queues.EmptyQueueException;
import br.univille.estd.queues.Queue;

public class ArrayQueue<E> implements Queue<E> {

	protected int f = 0;
	protected int r = 0;
	public static final int CAPACITY = 1000;
	protected int capacity;
	protected E Q[];
	public ArrayQueue() {
		this(CAPACITY);
	}
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		Q = (E[])new Object[this.capacity];
	}

	@Override
	public long size() {
		return (Q.length-f+r) % Q.length;
	}

	@Override
	public boolean isEmpty() {
		return (f==r);
	}

	@Override
	public void enqueue(E e) {
		if (size() == Q.length -1) {
			throw new FullQueueException("Fila cheia");
		}
		Q[r] = e;
		r = (r + 1) % Q.length;
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			throw new EmptyQueueException("Fila vazia");
		}
		E temp = Q[f];
		Q[f] = null;
		f = (f+1) % Q.length;
		return temp;
	}

	@Override
	public E front() {
		if (isEmpty()) {
			throw new EmptyQueueException("Fila vazia");
		}
		return Q[f];
	}

}
