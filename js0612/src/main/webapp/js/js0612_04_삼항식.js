/*
var num = prompt("1번째 숫자입력 해주세요");
var num = prompt("2번째 숫자입력 해주세요");
//var num2 = Number(prompt("2번째 숫자입력 해주세요"));

document.write(typeof(num), "<br>"); // str
document.write(typeof(num2), "<br>"); // str

// str이므로 숫자로 형변환 필요
document.write(Number(num)+Number(num2), "<br>");
document.write(Number(num)+Number(num2), "<br>"); 
// 위와 같이 하지 않고 위 3번줄처럼 바로 형변환 가능 */


// 두 수를 입력받아 큰 수를 출력해라(삼항식 사용)
var n1 = Number(prompt("1번째 숫자 입력 해주세요"));
var n2 = Number(prompt("2번째 숫자 입력 해주세요"));

var result = n1>n2? n1 : n2;
document.write("더 큰 수: ", result);
document.write("<br>");


