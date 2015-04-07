function convert() {
	var userInput = document.getElementById("input").value;
	var output = "";
	var location;
	
	var qwerty = "-=qwertyuiop[]asdfghjkl;'zxcvbnm,./ _+QWERTYUIOP{}ASDFGHJKL:\"ZXCVBNM<>?";
	var dvorak = "[]',.pyfgcrl/=aoeuidhtns-;qjkxbmwvz {}\"<>PYFGCRL?+AOEUIDHTNS_:QJKXBMWVZ";

	for(var i = 0; i<userInput.length; i++)
	{
		location = qwerty.indexOf(userInput[i]);
		
		if(location == -1)
			output += userInput.charAt(i);
		else
			output += dvorak.charAt(location);
	}
		
	document.getElementById("output").innerHTML = output;
}

	