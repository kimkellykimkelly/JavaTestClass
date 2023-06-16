/**
 * 성적처리 프로그램
 */

var htmlData = "";

for(var i=0; i<10; i++){
	htmlData += "<tr id = 'tbody'>"; // html에 tbody 지정해서 설정한 id와 똑같이 적어줌
	htmlData +=	"<td>"+(i+1)+"</td>";
	htmlData +=	"<td>김은솔</td>";
	// 81~100 랜덤함수 이용해서 국영수 점수를 입력받아 합계, 평균 추가해서 출력하기
	var kor = Math.floor(Math.random()*20)+81;
	var eng = Math.floor(Math.random()*20)+81;
	var math = Math.floor(Math.random()*20)+81;
	var total = kor+eng+math;
	var avg = (total/3.0).toFixed(2); // 소수점 2자리까지 반올림
	
	htmlData +=	"<td>"+kor+"</td>";
	htmlData +=	"<td>"+eng+"</td>";
	htmlData +=	"<td>"+math+"</td>";
	htmlData +=	"<td>"+total+"</td>";
	htmlData +=	"<td>"+avg+"</td>";
	htmlData +=	"<td>1</td>";
	htmlData +=	"<td>2023-06-12</td>";
	htmlData +=	"<td>관리자</td>";
	htmlData +=	"</tr>";
}

// document.write() => html body를 모두 지우고 실행하는 것
// 이 js 파일에서는 반복하는 부분만 적었기 때문에 document.write()가 아닌, 아래와 같이 실행 필요.
document.getElementById("tbody").innerHTML=htmlData;
