<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<h1 style="color:red;text-align:center">Actors Report Page</h1>

<c:choose>
<c:when test="${!empty pageData}">

<table border="1" align="center" bgcolor="yellow">

<tr>
<th>Actor</th>
<th>Actor Name</th>
<th>Actor Address</th>
<th>Actor Category</th>
<th>Actor Fee</th>
</tr>

<c:forEach var="actor" items="${pageData.getContent()}">
    <tr>
        <td>${actor.aid}</td>
        <td>${actor.aname}</td>
        <td>${actor.addrs}</td>
        <td>${actor.category}</td>
        <td>${actor.fee}</td>
        
    </tr>
</c:forEach>

</table>

<center><b>page no::${pageData.getNumber()+1} /${pageData.getTotalPages()}</b></center>
<br>
<center> 

<c:if test="${!pageData.isFirst()}">
<a href="report?page=0">First</a>
</c:if>
 &nbsp;&nbsp;&nbsp;

<c:if test="${!pageData.isLast()}">
<a href="report?page=${pageData.getNumber()+1}">Next</a>
</c:if>
&nbsp;&nbsp;&nbsp;

<c:forEach var="i" begin="1" end="${pageData.getTotalPages()}" step="1">
     [<a href="report?page=${i-1}">${i}</a> ] &nbsp;&nbsp;</c:forEach>
     &nbsp;&nbsp;&nbsp;
     
 <c:if test="${!pageData.isFirst()}">
<a href="report?page=${pageData.getNumber()-1}">Previous</a>
</c:if>
&nbsp;&nbsp;&nbsp;

<c:if test="${!pageData.isLast()}">
<a href="report?page=${pageData.getTotalPages()-1}">Next</a>
</c:if>

      
</center>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">No Record Found</h1>
</c:otherwise>
</c:choose>

<br>


<br><br>
<h1 style="text-align:center"><a href="./"><img src="Images/home1.jpg" width="300" height="300">Home</a></h1>
