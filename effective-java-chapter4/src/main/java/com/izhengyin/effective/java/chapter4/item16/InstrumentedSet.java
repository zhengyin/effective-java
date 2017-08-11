// Wrapper class - uses composition in place of inheritance - Page 84
package com.izhengyin.effective.java.chapter4.item16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class InstrumentedSet<E> extends ForwardingSet<E> {
	private int addCount = 0;

	public InstrumentedSet(Set<E> s) {
		super(s);
	}

	@Override
	public boolean add(E e) {
		addCount++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}

	public int getAddCount() {
		return addCount;
	}

	/**
	 * 给HashSet扩展出一个计数 (图书源码)
	 * @param args
	 */
	public static void main(String[] args) {
		InstrumentedSet<String> s = new InstrumentedSet<String>(new HashSet<String>());
		s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
		System.out.println(s.getAddCount());
	}
}
