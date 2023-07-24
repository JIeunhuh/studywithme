let message = 'hello';
message = 123456; // 자료의 타입은 있지만 변수에 저장되는 값의 타입이 언제든지 바뀌는 언어를 동적타입(dynamically typed)언어 라고 함

//1 숫자형 : 정수 및 부동소수점 숫자(floating point number)를 나타냄(대표 연산 : 사칙연산)
let n = 123;
n = 12.345;
// cf) 일반적인 숫자 외에 infinity, -infinity, nan 같은 특수숫자값(special numeric value)도 포함
// infinity : 무한대를 나타냄, nan : 계산 중 에러 발생, 부정확하거나 정의되지 않은 수학연산을 사용

//2 문자형 : js에서 string을 따옴표로 묶음
// 큰따옴표, 작은따옴표, 백틱(``)
let str = "hello"; // 기본적인
let str2 = 'jieun'; // 기본적인 따옴표 -> 큰따옴표, 작/따 차이 없
let str3 = `${str}, my name is ${str2}`; // 백틱 사용하면 ${} 안에 변수나 표현식을 활용해 쉽게 코드에 넣을 수 있음

// ex)
let name = 'John';

alert(`Hello, ${name}!`);

alert(`사칙연산 : 1+2 = ${1+2}!`);

// js는 character형 존재하지 않는다 !!

//3 bolean형 : 긍정 / 부정 두가지 값만 존재(true, false)를 나타내는 값을 저장할때 사용 

let nameFieldChecked = false;
let ageFieldChecked  = true;

console.log(nameFieldChecked)

// 비교결과를 저장할 때
let isGreater = (4>1);

alert(isGreater);

//4 null : 존재하지 않는 값, 비어있는 값, 알수 없는 값(null값만 포함하는 별도의 자료형을 만듦)
let age = null // 나이를 알수 없거나, 비어있음을 보여줌

//5 undefined : 값이 할당되지 않은 상태(변수는 선언했지만, 값을 할당하지 않으면 undefined가 자동으로 할당)
// 이것도 별도의 자료형이 있음
let agee;
alert(agee);
//변수에 undefined를 명시적으로 할당하는 것도 가능하지만 null로 표현하는걸 권장함

// 6 객체와 심볼(object & symbol)
//object type : 특수한 자료형(데이터 컬렉션이나 복잡한 개체(entity)를 표현할 수 있음)
//원시(primitive) 자료형 : 문자열이든 숫자든 한가지만 표현 가능(찾아보기 !)
// 심볼(symbol)형 : 객체의 고유한 식별자를 만들 때 사용(간단하게만)

// 7 typeof 연산자 : 인수의 자료형을 반환(자료형에 따라 처리방식을 다르게 하고 싶거나, 변수의 자료형을 빠르게 알아내고자 할때)

// 두가지 형태의 문법을 지원






