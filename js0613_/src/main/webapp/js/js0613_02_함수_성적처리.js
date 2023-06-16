// 성적처리
function stuScore(){
	var kor = Number(prompt("국어점수를 입력하세요"));
	var eng = Number(prompt("영어점수를 입력하세요"));
	var math = Number(prompt("수학점수를 입력하세요"));
	var total = kor+eng+math;
	var avg = (total/3.0).toFixed(2); // 소수점 2자리까지 반올림
	
    var htmlData = "";
    htmlData +=	"<tr>";
	htmlData +=	"<td>"+name+"</td>";
	htmlData +=	"<td>"+kor+"</td>";
	htmlData +=	"<td>"+eng+"</td>";
	htmlData +=	"<td>"+math+"</td>";
	htmlData +=	"<td>"+total+"</td>";
	htmlData +=	"<td>"+avg+"</td>";
	htmlData +=	"</tr>";

    document.getElementById("tbody").innerHTML=htmlData;

	console.log("합계: ", kor+eng+math);
	console.log("평균: ", ((kor+eng+math)/3.0).toFixed(2));
}