/*여러 줄 주석*/
// 한줄 주석

var num = 100;
var str = "200.3";
document.write(num+str, "<br>");

var num2 = parseInt(str); // 정수형 타입으로 형변환 => 200
var num4 = parseFloat(str); // 실수형 타입으로 형변환 => 200.3
var num3 = Number(str); // 정수형, 실수형 모든 타입으로 형변환 => 200.3
document.write(num+num2, "<br>"); // 300
document.write(num+num3, "<br>");// 300.3

