package br.univille.estd.queues.array;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.univille.estd.queues.EmptyQueueException;
import br.univille.estd.queues.Queue;

public class ArrayQueueTests {
	
	@Test
	public void isEmpty() {
		Queue<Integer> queue = new ArrayQueue<Integer>();
		assertEquals("A fila deve estar vazia",true,queue.isEmpty());
	}
	
	@Test
	public void size() {
		Queue<Integer> queue = new ArrayQueue<Integer>();
		assertEquals("O tamanho da fila deve ser zero",0,queue.size());
	}
	
	@Test
	public void enqueue() {
		Queue<Integer> queue = new ArrayQueue<Integer>();
		queue.enqueue(10);
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
	@Test
	public void front() {
		Queue<Integer> queue = new ArrayQueue<Integer>();
		queue.enqueue(10);
		queue.enqueue(15);
		assertEquals("Front deve retornar o elemento 10",10,(int)queue.front());
	}
	
	@Test
	public void dequeue() {
		Queue<Integer> queue = new ArrayQueue<Integer>();
		queue.enqueue(10);
		queue.enqueue(15);
		assertEquals("Front deve retornar o elemento 10",10,(int)queue.dequeue());
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
	@Test
	public void dequeueThrowsException() {
		Queue<Integer> queue = new ArrayQueue<Integer>();
		try {
			queue.dequeue();
			fail("Fila deve gerar exceçao EmptyQueueException");
		}catch(EmptyQueueException ignored) {
		}
	}
	
	@Test
	public void frontThrowsException() {
		Queue<Integer> queue = new ArrayQueue<Integer>();
		try {
			queue.front();
			fail("Fila deve gerar exceçao EmptyQueueException");
		}catch(EmptyQueueException ignored) {
		}
	}
	
	@Test
	public void enqueueThrowsException() {
		Queue<Integer> queue = new ArrayQueue<Integer>(1);
		try {
			queue.enqueue(1);
			queue.enqueue(2);
			fail("Fila deve gerar exceçao FullQueueException");
		}catch(FullQueueException ignored) {
		}
	}

}
