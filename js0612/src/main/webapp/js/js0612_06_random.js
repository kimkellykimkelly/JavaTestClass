/**
 * 랜덤함수 
 */

 // 변수 선언 방법: let,var, constant
 
 // random 함수
 var random = Math.floor(Math.random()*100)+1; // 1-100
 var input = prompt("1~100 사이 숫자를 입력해라");
 
 if(input==random){ 
// 타입이 input은 문자열이고 random은 숫자형이지만, 따로 형변환 필요없음
// === 를 사용하면, 타입까지 같아야 같다고 나옴!
	 document.write("정답: ", random);
 } else{
	 //document.write("오답임. 정답: ", random);	 
	 alert("오답임. 정답: "+random);	 
	 // alert: 경고창 떠서 확인 눌러야 팝업 사라짐 
	 location.reload; // 오답일 경우 계속 재실행됨.
}