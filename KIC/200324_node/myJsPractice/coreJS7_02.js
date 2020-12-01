//유사 배열 => 프로토타입 체인을 통해 배열기능 추가
var Grade = function () {
    var args = Array.prototype.slice.call(arguments);
    for(var i = 0; i < args.length; i++) {
        this[i] = args[i];
    }
    this.length = args.length
};

Grade.prototype = []; //배열의 프로토타입을 참조

var g = new Grade(100, 80);
// g.__proto__ = [];

console.log(g);
g.pop();
console.log(g);
g.push(90);
console.log(g);