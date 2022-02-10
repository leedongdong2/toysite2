/**
 * 
 */
var video = document.getElementsByClassName("video");
var playList = document.getElementsByClassName("playList")
Array.prototype.forEach.call(video,function(item,index){
    item.addEventListener("mouseenter",function(ev){
	playList[index].play();
});
});

Array.prototype.forEach.call(video,function(item,index){
    item.addEventListener("mouseleave",function(ev){
	playList[index].pause();
	playList[index].currentTime = 1;
});
});

var vMain = document.getElementsByClassName("vMain");
var bannerItemBox = document.getElementsByClassName("bannerItemBox");
Array.prototype.forEach.call(bannerItemBox,function(item,index){
	item.addEventListener("mouseenter",function(ev){
	vMain[index].play();
	console.log(vMain[index])
	console.log(index)	
	})
})


$(document).ready(function(){

	
		$('.single-item').slick({
			slide: 'div',
			infinite : true,
			speed : 500,
			dot : false,
			arrows : true, 	
			autoplay : true,
			autoplaySpeed : 3000,
			prevArrow: $('.prev'),
			nextArrow: $('.next'),
			draggable:false,
			pauseOnHover : true
		})
		

		
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
