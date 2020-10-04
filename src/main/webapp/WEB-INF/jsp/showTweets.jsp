<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<html>
<head>
<title>Tweets</title>
	<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
 	<div id="pageStuff" class="nav nav-tabs nav-stacked">
		<c:forEach var="listValue" items="${tweets}">
			<li><p id="paraStyle" class= "my_rounded_corners">${listValue.text}</p></li>
		</c:forEach>
	</div>
	  	<div class="span6">
   		<div class="pagination">
     		<ul class="pager"></ul>
  		</div> 
	</div> 
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
        <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>	
</body>
</html>