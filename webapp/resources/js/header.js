var menuBar = document.getElementById("menuBar");
var topMenu = document.getElementById("topMenu");
menuBar.addEventListener("click",function(){
	if(topMenu.style.top != "46%") {
		topMenu.style.top = "46%";
	} else {
		topMenu.style.top = "-50%"
	}
}) 
