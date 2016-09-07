exports.test=function(message){
	console.log("call");
	var b = cordova.exec(null, null, "main", "show", [message]);
	console.log("called",b);
}