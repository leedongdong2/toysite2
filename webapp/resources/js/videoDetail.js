/**
 * 
 */

var latestProjectsVideo = document.getElementsByClassName("latestProjectsVideo");
var latestProjectsVideoList = document.getElementsByClassName("latestProjectsVideoList")
Array.prototype.forEach.call(latestProjectsVideo,function(item,index){
    item.addEventListener("mouseenter",function(ev){
	latestProjectsVideoList[index].play();
});
});

Array.prototype.forEach.call(latestProjectsVideo,function(item,index){
    item.addEventListener("mouseleave",function(ev){
	latestProjectsVideoList[index].pause();
	latestProjectsVideoList[index].currentTime = 0;
});
});


function postHref(name,value,url){
	var form = document.createElement('form'); // 폼객체 생성
	var objs;
	objs = document.createElement('input'); // 값이 들어있는 녀석의 형식
	objs.setAttribute('type', 'text'); // 값이 들어있는 녀석의 type
	objs.setAttribute('name', name); // 객체이름
	objs.setAttribute('value', value); //객체값
	form.appendChild(objs);
	form.setAttribute('method', 'post'); //get,post 가능
	form.setAttribute('action', url); //보내는 url
	document.body.appendChild(form);
	form.submit();
	document.body.removeChild(form);
}