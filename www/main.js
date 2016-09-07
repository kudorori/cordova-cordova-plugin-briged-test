exports.test=function(message){
		cordova.exec(null, null, "main", "show", [message]);
	
}