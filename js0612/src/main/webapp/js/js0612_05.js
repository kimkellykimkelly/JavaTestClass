var input = prompt("숫자 입력하세요", "예시: 20");
/*var input = Number(prompt("숫자 입력"));*/

// 입력한 숫자가 홀수인지 짝수인지 출력하기
if(input%2 == 0){ 
	document.write("짝수");
}else{
	document.write("홀수");	
}
// 문자열에는 % 없으므로 숫자로 자동형변환되지만, 2번째줄처럼 먼저 형변환하는 걸 권장.


/*var input = prompt("1번째 숫자 입력해"); //20
var input2 = prompt("2번째 숫자 입력해"); //10

document.write(input+input2); //2010
document.write("<br>"); 
document.write(input-input2); //10 (문자열에는 빼기가 없으므로 자동형변환됨!)*/

