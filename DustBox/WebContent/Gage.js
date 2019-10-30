let a,
	b;

var x = 1000;
var y = 800;

var timer1 = document.getElementById("timer1");
function start1(){
console.log("start1");	// DEBUG
timer1.style.height = "0px"; // ←widthを0pxにすることで減っていくアニメーションが始まる。
}
function stop1(){
console.log("stop1");	// DEBUG
a = timer1.offsetHeight;
timer1.style.height = a + "px"; // ←停止の為に、現在の幅をheightに与える。
console.log(a);
//let heightA = document.getElementById("heightText");
//heightA.textContent = a;
//Main.javaに値を送りたい(ビーンズに保存）
}

var timer2 = document.getElementById("timer2");
function start2(){
console.log("start2");	// DEBUG
timer2.style.width = "0px"; // ←widthを0pxにすることで減っていくアニメーションが始まる。
}
function stop2(){
console.log("stop2");	// DEBUG
b = timer2.offsetWidth;
timer2.style.width = b + "px"; // ←停止の為に、現在の幅をwidthに与える。
console.log(b);
}