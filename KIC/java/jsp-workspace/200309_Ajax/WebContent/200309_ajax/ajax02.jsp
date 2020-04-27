<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		this.document.getElementById('btn').onclick = function() {
			//alert('click');        
			var request = new XMLHttpRequest();

			//익스(허용) : 크롬(비허용)
			//크로스도메인 : 데이터와 html(뷰)은 같은 ip에서 요청되어야함 ← ajax의 보안
			request.open('GET',
					'http://localhost:8080/200309_Ajax/data2/csv2.jsp',
					false);
			//request.open('GET', 'http://192.168.0.18:8080/200309_Ajax/data2/csv2.jsp', false);
			request.send();

			console.log(request.responseText);

			var data = request.responseText.trim();
			var arrData = data.split('\n');
			var result = "<table width='600' border='1'>";
			for (var i = 0; i < arrData.length; ++i) {
				var rowData = arrData[i].split(',');

				result += "<tr>";
				result += "<td>" + rowData[0] + "</td>";
				result += "<td>" + rowData[1] + "</td>";
				result += "<td>" + rowData[2] + "</td>";
				result += "<td>" + rowData[3] + "</td>";
				result += "</tr>";

			}
			result += "</table>";

			document.getElementById('result').innerHTML = result;
		}
	}
</script>
</head>
<body>

	<button id="btn">요청</button>
	<br>
	<hr>
	<br>
	<div id="result"></div>

</body>
</html>