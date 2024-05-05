package com.danish.collectons;

public class Pair<T, V> {
	private T key;
	private V value;

	Pair(T t, V v) {
		this.key = t;
		this.value = v;
	}

	public void setKey(T t) {
		this.key = t;
	}

	public void setValue(V t) {
		this.value = t;
	}

	public T getKey() {
		return this.key;
	}

	public V getValue() {
		return this.value;
	}
}
