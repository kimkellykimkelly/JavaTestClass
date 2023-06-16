/**
 * for문
 */

// 두 수를 입력받아 작은수부터 큰수까지의 합을 구해라
var input1 = Number(prompt("1번째 숫자를 입력해라")); 
var input2 = Number(prompt("2번째 숫자를 입력해라")); 

// Math.min, Math.max 함수 이용하는 방법
var num1 = Math.min(input1, input2);
var num2 = Math.max(input1, input2);

/*
// 삼항식 이용하는 방법
var num1 = (input1<input2)? input1 : input2;
var num2 = (input1>input2)? input1 : input2;
*/

var sum = 0;
for(var i = num1; i <= num2; i++){
	if(i%2!=0){ // 홀수만 더하기
	sum += i;
	}
}

document.write("입력한 숫자 사이의 모든 홀수만의 합: ", sum);

// 홀수합
