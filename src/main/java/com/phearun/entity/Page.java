package com.phearun.entity;

import java.util.Collection;

import com.phearun.utility.Paging;

public class Page<T> {

	private Paging paging;
	private Collection<T> contents;

	public Paging getPaging() {
		return paging;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}

	public Collection<T> getContents() {
		return contents;
	}

	public void setContents(Collection<T> contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Pagable [paging=" + paging + ", contents=" + contents + "]";
	}

}
