<%@ page
	language="java"
	pageEncoding="UTF-8"
	%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>	
<html>
	<head>
		<meta charset="UTF-8">
		<title>TITLE</title>
	</head>

	<body>
	
		<jsp:useBean id="pascal" class="fr.dwaps.main.Pere" />
		<jsp:setProperty name="pascal" property="firstname" value="Pascal" />
		<jsp:useBean id="carolina" class="fr.dwaps.main.Mere" />
		<jsp:setProperty name="carolina" property="firstname" value="Carolina" />
		<jsp:useBean id="fernando" class="fr.dwaps.main.Frere" />
		<jsp:setProperty name="fernando" property="firstname" value="Fernando" />
		<jsp:useBean id="salmonella" class="fr.dwaps.main.Frere" />
		<jsp:setProperty name="salmonella" property="firstname" value="Salmonella" />
		
		<jsp:useBean id="famille" class="fr.dwaps.main.Famille" />
		<jsp:setProperty name="famille" property="name" value="Semoule" />
		<jsp:setProperty
			name="famille"
			property="membres"
			value="${ l = [pascal, carolina, fernando, salmonella] }" />
		
		<ul>
		<c:forEach items="${famille.membres}" var="membre">
			<li>${membre}</li>
		</c:forEach>	
		</ul>
	
	</body>
</html>



