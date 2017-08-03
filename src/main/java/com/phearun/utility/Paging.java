package com.phearun.utility;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Paging {
	
	private int page;
	private int limit;
	private int pagesTotal;
	
	private int draw; //Important when working with DATATABLE
	private int recordsTotal;
	private int recordsFiltered;
	
	@JsonIgnore
	private int offset;

	public Paging() {
		this(1, 1, 10, 0, 0, 0);
	}
	public Paging(int draw, int page, int limit, int recordsTotal, int recordsFiltered, int pagesTotal) {
		this.draw = draw;
		this.page = page;
		this.limit = limit;
		this.pagesTotal = pagesTotal;
		this.recordsTotal = recordsTotal;
		this.recordsFiltered = recordsFiltered;
	}

	public int getPage() {
		return page;
	}
	public void setPage(int currentPage) {
		this.page = (currentPage <= 1) ? 1 : currentPage;
	}
	
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPagesTotal() {
		return (int) Math.ceil((double) this.recordsFiltered / limit);
	}
	public void setPagesTotal(int pagesTotal) {
		this.pagesTotal = pagesTotal;
	}

	public int getOffset() {
		return (this.page - 1) * this.limit;
	}
	
	public int getRecordsTotal() {
		return recordsTotal;
	}
	public void setRecordsTotal(int recordsTotal) {
		this.recordsTotal = recordsTotal;
	}
	
	public int getRecordsFiltered() {
		return recordsFiltered;
	}
	public void setRecordsFiltered(int recordsFiltered) {
		this.recordsFiltered = recordsFiltered;
		this.pagesTotal = this.getPagesTotal();
	}
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	@Override
	public String toString() {
		return "Paging [page=" + page + ", limit=" + limit + ", pagesTotal=" + pagesTotal + ", draw=" + draw
				+ ", recordsTotal=" + recordsTotal + ", recordsFiltered=" + recordsFiltered + ", offset=" + offset
				+ "]";
	}
}
