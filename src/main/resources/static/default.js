function abc() {
    $('#myTable').DataTable();
    $('.dataTables_length').addClass('bs-select');
}
function home(a) {
	getAllData(this.callback);
}
function callback(data) {
	createTable(data);
}
function getAllData(callback) {
	var temp = {}
	url = "http://localhost:8888/Get";
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.status == 200 && this.readyState == 4) {
			callback(xhttp.response);
		}
	};
	xhttp.open("GET", url, true);
	// xhttp.setRequestHeader("data",data);
	xhttp.send();
}
function createTable(data) {
	var div = document.getElementById('root');
	data = JSON.parse(data);
	//Table Main
	var element = document.createElement("div");
	element.setAttribute("class", "container-fluid");
	div.appendChild(element);
	div = element;
	element = document.createElement("TABLE");
	element.setAttribute("class","table table-striped table-bordered");
	element.setAttribute("id", "myTable");
	div.appendChild(element);
	// Table Head
	div = element;
	element = document.createElement("thead");
	div.appendChild(element);
	var head = element;
	/*element = document.createElement("tr");
	var keyList = Object.keys(data[0]);
	head.appendChild(element);
	for (var i = 0; i < keyList.length; i++) {
		var td = document.createElement("th");
		var input = document.createElement("input");
		keyList[i]=keyList[i].toUpperCase();
		input.setAttribute("id", keyList[i]);
		keyList[i]=keyList[i].replace(new RegExp("_",'g')," ");
		input.setAttribute("type", "text");
		input.setAttribute("placeholder", keyList[i]);
		input.setAttribute("class","form-control")
		td.appendChild(input);
		element.appendChild(td);
	}*/
	element = document.createElement("tr");
	head.appendChild(element);
	keyList = Object.keys(data[0]);
	for (var i = 0; i < keyList.length; i++) {
		var td = document.createElement("th");
		td.appendChild(document.createTextNode(((keyList[i]))
				.toUpperCase()));
		element.appendChild(td);
	}
	element = document.createElement("tbody");
	div.appendChild(element);
	div = element;
	for (var i = 1; i < data.length; i++) {
		element = document.createElement("tr");
		div.appendChild(element);
		for (var j = 0; j < Object.values(data[i]).length; j++) {
			var td = document.createElement("td");
			td.appendChild(document.createTextNode(Object.values(data[i])[j]));
			element.appendChild(td);
		}
	}
	abc();
}