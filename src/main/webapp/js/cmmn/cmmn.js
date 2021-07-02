$(function(){
	cmmnOBJ.create();
});

var cmmnOBJ = {
	create : function(){
		var that = this;
		
		that.init();
		that.bind();
	},
	init : function(){
		var that = this;
	},
	bind : function(){
		var that = this;
		
		boardList(1);
	}
}


function boardList(page){
	$.ajax({
		url : "/ajax/boardList.do",
		data : {page : page},
		dataType : "json",
		type : "GET",
		success : function(result){
			$("#table").empty();
			for(var i = 0 ; i < result.list.length ; i++){
				var html = "<tr><td>글번호</td><td>제목</td><td>작성일</td><td>조회수</td><td>추천</td></tr>";
				html += "<tr>"
				html += "<td>"+result.list[i].board_no+"</td>";
				html += "<td>"+result.list[i].board_title+"</td>";
				html += "<td>"+result.list[i].board_data+"</td>";
				html += "<td>"+result.list[i].board_cnt+"</td>";
				html += "<td>"+result.list[i].board_like+"</td>";
				html += "</tr>"
				$("#table").append(html);
			}
		}
	})
}