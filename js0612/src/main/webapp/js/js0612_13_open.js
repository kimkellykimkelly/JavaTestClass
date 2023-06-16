/**
 * 함수 / open / confirm / alert
 */

//함수
function pop(){
	/*alert("함수 pop()이 연결되었습니다");*/
	
	//팝업창
	window.open("popup.html","pop1", "width: 400, height: 600, left=0, top=0");
	// "pop1"과 같이 이름을 지정 안하면 팝업 창이 계속 뜸
	// 요즘엔 팝업창보다는 "모달창"이 많이 쓰임
}

function dataDelete(){
	/*alert("삭제함수가 호출되었습니다");*/
	if(confirm("게시글을 삭제하시겠습니까?")){ // "게시글을 삭제하시겠습니까?" 창이 떴을 때 확인을 누르면
	   alert("게시글이 삭제되었습니다");
	   //삭제 코드 추가하면됨
	} else{
	   alert("삭제가 취소되었습니다");
	   //기존 페이지로 가면됨
	}
	
}



