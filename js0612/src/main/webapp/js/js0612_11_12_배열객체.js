/**
 * 배열 객체
 */

// 배열에는 형 상관없이 들어갈 수 있음.
var arr = [30, "김은솔", true, 31.25];
// 자바에서는 배열에 같은 형만 들어가기 때문에 객체를 사용했음.
/*But, js에서는 배열 안에 다른 형과 함수까지 모두 들어갈 수 있기 때문에,
이게 바로 객체임 => 배열객체라고 함!*/
for(var i=0; i<arr.length; i++){
	document.write(arr[i], "<br>");
}

//
var arr1 = ["홍길동","유관순","이순신"];
var arr2 = ["강감찬","김구"];

// push: 배열 맨 뒤에 값 넣기
var result = arr1.push("김유신");
document.write(result);
console.log(arr1);

// 출력
// 기본 for문
for(var i=0; i<arr.length; i++){
	document.write(arr[i], "<br>");
}

// 단순 for문
for(var i of arr1){ // 변수 of 배열
	document.write("배열: ", i);
	document.write("<br>");
}


