package com.phearun.datatable;

import java.util.Map;

public class DataTableFilter {

	private Integer draw = 1; // draw
	private Integer start = 0; // offset
	private Integer length = 10; // limit
	private String search = null; // search
	private Integer totalCount; //record count
	private Integer filterCount;
	
	public DataTableFilter(Map<String, Object> map) {
		Object dr = map.get("draw"), st = map.get("start"), le = map.get("length"), se = map.get("search[value]");
		if (!map.isEmpty()) {
			if (dr != null) this.draw = Integer.parseInt((String) dr);
			if (st != null) this.start = Integer.parseInt((String) st);
			if (le != null) this.length = Integer.parseInt((String) le);
			if (se != null) this.search = (String) se;
		}
	}
	public Integer getDraw() {
		return draw;
	}
	public void setDraw(Integer draw) {
		this.draw = draw;
	}
	public Integer getStart() {
		return start;
	}
	public void setStart(Integer start) {
		this.start = start;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getFilterCount() {
		return filterCount;
	}
	public void setFilterCount(Integer filterCount) {
		this.filterCount = filterCount;
	}
	@Override
	public String toString() {
		return "DataTableFilter [draw=" + draw + ", start=" + start + ", length=" + length + ", search=" + search
				+ ", totalCount=" + totalCount + ", filterCount=" + filterCount + "]";
	}
}
