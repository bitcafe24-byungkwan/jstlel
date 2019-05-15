<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("i", 10);
	int i = 20;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>데이터타입</h1>
	${iVal }
	<br> ${lVal }
	<br> ${fVal }
	<br> ${bVal }
	<br> -${obj }-
	<br>

	<h1>연산</h1>
	${iVal+20*lVal/2-10 } <br>
	${iVal < lVal && fVal < 5 } <br>
	${empty obj } <br>
	${not empty obj } <br>
	
	<h1>요청 파라미터 가져5기</h1>
	<%= request.getParameter("a") + 10 %>
	${param.a + 10}
	
	<h1>객체 접금</h1>
	${sessionScope.vo.no } <br>
	${vo.no } <br>
	${vo.name } <br>
	
	<h1>Map 객체 접근</h1>
	${map.iVal } <br>
	${map.lVal } <br>
	${map.bVal } <br>
	${map.fVal } <br>
	-${map.nVal }- <br>
	
</body>
</html>