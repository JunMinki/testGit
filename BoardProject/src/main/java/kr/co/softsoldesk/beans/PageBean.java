package kr.co.softsoldesk.beans;

public class PageBean {
	
	private int min;//최소 페이지 번호
	private int max;//최대 페이지 번호
	private int prevPage;//이전 버튼의 페이지 번호
	private int nextPage;//다음 버튼의 페이지 번호
	private int pageCnt;//전체 페이지 번호
	private int currentPage;//현재 페이지 번호
	
	public PageBean(int contentCnt, int currentPage, int contentPageCnt, int paginationCnt) {
	/*
	  	contentCnt : 전체글 개수
	  	currentPage : 현재 페이지 번호
	  	contentPageCnt : 페이지당 글의 개수(10) - optiont.properties에서 10으로 지정해놓음
	  	paginationCnt : 한번에 표시할 페이지 버튼의 개수 (즉 게시글이 21개면 3개의 링크 버튼이 필요)
	 
	*/
		
		this.currentPage = currentPage;
		
		pageCnt = contentCnt/contentPageCnt;//게시글 수에 따른 페이지의 수
		/*
		 	게시글이 1개 -> 0페이지 +1필요
		 	게시글이 9개 -> 0페이지 +1필요
		 	게시글이 10개 -> 1페이지
		 	게시글이 11개 -> 1페이지 +1필요
		 	게시글이 20개 -> 2페이지
		 */
		
		if(contentCnt % contentPageCnt >0) {//pageCnt가 10의 단위가 아니면
			
			pageCnt++;
		}
		
		min = ((currentPage-1)/contentPageCnt) * contentPageCnt + 1;
		//1페이지 : ((1-1)/10) + 1 => 1
		//2페이지 : ((2-1)/10) + 1 => 1
		//11페이지 : ((11-1)/10) + 1 => 11
		//1~10 페이지의 최소 페이지는 1
		//11~19 페이지의 최소 페이지는 11
		
		max = min + paginationCnt -1;//최대 페이지
		//1~10페이지 : 1 + 10 - 1 => 10 [1]이 보이는 화면에서는 [10]이 최대 페이지
		//11~20페이지 : 11 + 10 - 1 => 20 [11]이 보이는 화면에서는 [20]이 최대 페이지
		
		if(max > pageCnt) {
			
			max = pageCnt;
			
		}
		//전체 페이지가 3페이지까지 있으면 max 페이지는 3페이지로 제한
		//전체 페이지가 11페이지까지 있으면 max 페이지는 11페이지로 제한 ([11])
		//즉 전체 페이지가 3까지 있다면 ([1] [2] [3]) 까지만 출력이 나오게 됨
		
		prevPage = min - 1;
		//이전 페이지는 최소 페이지에서 -1/ <이전 [11] => [10]
		
		nextPage = max + 1;
		//다음 페이지는 최대 페이지에서 +1/ [10] 다음> => [11]
		
		if(nextPage > pageCnt) {
			
			nextPage = pageCnt;
		}
		//전체 페이지가 15(pageCnt)페이지일 때, nextPage는 16페이지어야 하지만 현재 페이지가 15페이지이면 nextPage를 15로 고정
	}
	
	public int getCurrentPage() {
		return currentPage;
	}

	public int getMin() {
		return min;
	}
	public int getMax() {
		return max;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public int getPageCnt() {
		return pageCnt;
	}
}
