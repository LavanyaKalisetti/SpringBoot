<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1 style="color:red;text-align:center">Result Page(result.jsp)</h1>

<br><br>

<b>Model Attribute Values are:- ${name},${age} </b>

<br><br>

<i>Nick Names::</i><br>
 <c:if test="${!empty nickNames }">
 <c:forEach var="name" items="${nickNames}">
  ${name}<br>
</c:forEach>
</c:if>

<br><br>

<i>Friends::</i><br>
 <c:if test="${!empty nickNames }">
 <c:forEach var="friend" items="${friends}">
 ${fr}<br>
</c:forEach>
</c:if>

<br><br>

<i>PhoneNumbers::</i><br>
 <c:if test="${!empty phones }">
 <c:forEach var="name" items="${phones}">
 <br> ${ph}<br>
</c:forEach>
</c:if>

<br><br>

<i>idDetails::</i><br>
 <c:if test="${!empty idDetails }">
 <c:forEach var="name" items="${idDetails}">
 <br> ${id.key}&nbsp;&nbsp;${id.value}<br>
</c:forEach>
</c:if>

<br><br>





<%-- <%@ page import="java.util.*"%>

<h1 style="color:red;text-align:center">Result Page(result.jsp)</h1>

<br>
<br>

<b>Model Attribute Values are:-</b>

<i> Nick names::<% Arrays.toString(((String[])request.getAttribute("nickNames")))%></i><br>
<i> Friends:: ${friends}</i><br>
<i> Phones:: ${phones}</i><br>
<i> IDDetails:: ${idDetails}</i><br> --%>
