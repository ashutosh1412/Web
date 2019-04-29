function message() {
	var div = document.getElementById('root');
	div.innerHTML = "<table class=\"table table-borderless\">\r\n"
			+ "		<tr>\r\n"
			+ "			<td>Name <span class=\"text-danger\">*</span></td>\r\n"
			+ "			<td><input type=\"text\" value=\"Ashu\" id=\"name\" required/></td>\r\n"
			+ "		</tr>\r\n"
			+ "		<tr>\r\n"
			+ "			<td>Subject</td>\r\n"
			+ "			<td><input type=\"text\" value=\"Fire\" id=\"subject\"></td>\r\n"
			+ "		</tr>\r\n"
			+ "		<tr>\r\n"
			+ "			<td>Location <span class=\"text-danger\">*</span></td>\r\n"
			+ "			<td><input type=\"text\" value=\"Banglore\" id=\"location\"required/></td>\r\n"
			+ "		</tr>\r\n"
			+ "		<tr>\r\n"
			+ "			<td>Message Content</td>\r\n"
			+ "			<td><textarea id=\"content\"></textarea></td>\r\n"
			+ "		</tr>\r\n"
			+ "		<tr>\r\n"
			+ "			<td><button type=\"button\" class=\"btn btn-warning\" onclick=\"home()\">Back</button></td>\r\n"
			+ "			<td><button type=\"button\" class=\"btn btn-success\" onclick=\"sendMessage()\">Submit</button></td>\r\n"
			+ "		</tr>\r\n" + "	</table>";
}
function home() {
	var div = document.getElementById('root');
	div.innerHTML = "<table class=\"table table-borderless\">\r\n"
			+ "			<tr>\r\n"
			+ "				<td><button type=\"button\" class=\"btn btn-danger\">Call</button></td>\r\n"
			+ "			</tr>\r\n" + "			<tr>\r\n"
			+ "				<td><button type=\"button\" class=\"btn btn-danger\"\r\n"
			+ "						onclick=\"message()\">Message</button></td>\r\n"
			+ "			</tr>\r\n" + "		</table>";

}
function sendMessage() {
	var name = document.getElementById("name").value;
	var subject = document.getElementById("subject").value;
	var location = document.getElementById("location").value;
	var content = document.getElementById("content").value;
	var timeStamp = new Date();
	var params = {};
	params["name"] = name, params["content"] = content,
			params["subject"] = subject, params["location"] = location,
			params["timeStamp"] = timeStamp.toString()
	console.log(typeof params)
	url = "http://192.168.1.23:8080/Messaging";
	var xhttp = new XMLHttpRequest();
	xhttp.open("POST", url, true);
	xhttp.setRequestHeader("Content-type", "application/json");
	xhttp.send(JSON.stringify(params));
	xhttp.onreadystatechange = function() {
		  if (this.status == 200) {
		    //var myArr = JSON.parse(this.responseText);
		    console.log(this.getAllResponseHeaders());
		  }
		};
<<<<<<< HEAD
}
function getData(data)
{
	url = "http://192.168.1.23:8080/getData";
	var xhttp = new XMLHttpRequest();
	xhttp.open("GET", url, true);
	xhttp.setRequestHeader("data",data);
	xhttp.send(JSON.stringify(params));
	xhttp.onreadystatechange = function() {
		  if (this.status == 200) {
		    return JSON.parse(this.responseText);
		  }
		};
}
function displayUser()
{
	var userList={}
	userList = getData("User");
	display(userList));
}
function display(list)
{
	var div = document.getElementById('root');
	for(i=0;i<list.length;i++){
		div.innerHTML = "table";
	}
=======
>>>>>>> 51f9fe8beed2eff9870235f4fc0e98a0bcdbe7bb
}