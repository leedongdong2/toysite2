/**
 * 
 */
var ourActBg = document.getElementsByClassName("ourActBg");
var ourActTilte = document.getElementsByClassName("ourActTilte");

/*div offset*/
var creativePlanningTop =  document.getElementById("creativePlanning").offsetTop;
var cinematographyTop = document.getElementById("cinematography").offsetTop;
var videoEditingTop =  document.getElementById("videoEditing").offsetTop;
var ditTop =  document.getElementById("dit").offsetTop;

var offsetTop = [creativePlanningTop,cinematographyTop,videoEditingTop,ditTop]

Array.prototype.forEach.call(ourActTilte,function(item,index){
	item.addEventListener("mouseover",function(){
		for(var i = 0; i < ourActTilte.length ; i++) {
			if(i != index) {
				ourActTilte[i].classList.add("ourActTilteOpacity");			
			}
		}
	})
})

Array.prototype.forEach.call(ourActTilte,function(item,index){
	item.addEventListener("mouseout",function(){
		for(var i = 0; i < ourActTilte.length ; i++) {
				ourActTilte[i].classList.remove("ourActTilteOpacity");			
		}
	})
})


Array.prototype.forEach.call(ourActTilte,function(item,index){
	item.addEventListener("click",function(){
		$('body,html').animate({scrollTop:offsetTop[index]},300);
	})
})




const triggerTop = new ScrollTrigger.default();
triggerTop.add('[data-activeTop]');




const triggerBot = new ScrollTrigger.default();
triggerBot.add('[data-activeBot]');

const triggerCliant = new ScrollTrigger.default();
triggerBot.add('[data-activeCliant]');




