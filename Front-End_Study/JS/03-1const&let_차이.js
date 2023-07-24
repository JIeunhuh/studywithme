// let & const의 차이점
// let -> 으로 선언된 변수는 선언된 블록 내에서만 사용가능 -> 지역변수?
//     -> 해당 범위(블록) 내에서 업데이트 될 수 있지만 다시 선언할 수 x
// ex)
// let word = 'hi';
// let word = 'say hello'; -> error!
// - 동일한 변수가 다른 범위(블록) 내에서 정의되면, 오류 발생 안함(서로 다른 변수로 취급)
// - let의 선언은 맨 위로 끌어올려짐. 그러나 키워드는 초기화되지 않으므로 변수 선언이전에 사용하면 reference error 발생함

// const -> 으로 선언된 변수는 일정한 상수 값을 유지 & 블록 범위 내에서만 사용 가능 -> 그러나 'let'과는 다르게 업데이트도, 재선언도 할 수 없음
// const hi = 'hihi';
// hi = 'hello'; // -> Assignment to constant variable.(error!)
// //당연히 재선언도 안됨
// console.log(hi);
// 그러나 const 객체는 업데이트 할 수 없지만, 개체의 '속성'은 업데이트 가능
//ex)
const word = {
    message: 'hello',
    time: 4
};
console.log(word)

// word = {
//     hello : 'hello',
//     times : 5
// } // -> Assignment to constant variable.(error!)

// const 변수의 속성을 업데이트 하는 것은 가능하다 !
word.message = 'hihi';

console.log(word);
// 또한 let과 마찬가지로 const 선언도 맨 위로 끌어올려지지만, 초기화되지는 않음
// let & const -> 변수범위는 블록 내, let은 업데이트 가능, const 불가능, 둘 다 업데이트 불가능, 두 변수 모두 최상위로 호이스팅되고, 초기화 되지 않음
