/**
 * 
 */

var topPos = $("#imageZone").position().top;

$("#about").click(function(){
$('body,html').animate({scrollTop:topPos},1000);
});