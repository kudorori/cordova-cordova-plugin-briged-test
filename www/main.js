exports.test=function(message){
	console.log("call");
	var b = cordova.exec(
	function(e){
		console.log("call success",e);
	}, 
	function(e){
		console.log("call error",e);
	}, "main", "show123", [message]);
	console.log("called",b);
}