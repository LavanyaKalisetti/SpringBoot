<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<h1 style="color:red;text-align:center">Actors Report Page</h1>

<c:choose>
<c:when test="${!empty listActors}">

<table border="1" align="center" bgcolor="yellow">

<tr>
<th>Actor</th>
<th>Actor Name</th>
<th>Actor Address</th>
<th>Actor Category</th>
<th>Actor Fee</th>
<th>Operations</th>
</tr>

<c:forEach var="actor" items="${listActors}">
    <tr>
        <td>${actor.aid}</td>
        <td>${actor.aname}</td>
        <td>${actor.addrs}</td>
        <td>${actor.category}</td>
        <td>${actor.fee}</td>
        <td><a href="edit?no=${actor.aid}"><img src="Images/edit.jpg" width="40px" height="40px"></a>
            &nbsp;&nbsp;&nbsp
            <a href="delete?no=${actor.aid}" onclick="return confirm('Are you Sure that You want to delete Record?')"><img src="Images/delete.jpg" width="40px" height="40px"></a>
        </td>
    </tr>
</c:forEach>



</table>
</c:when>
<c:otherwise>
<h1 style="color:red;text-align:center">No Record Found</h1>
</c:otherwise>
</c:choose>

<br>
<c:if test="${!empty resultMsg}">
<h1 style="color:green;text-align:center">${resultMsg}</h1>
</c:if>

<br>
<h1 style="text-align:center"><a href="register"><img src="Images/add.jpg" width="300" height="300">Register</a></h1>


<br><br>
<h1 style="text-align:center"><a href="./"><img src="Images/home1.jpg" width="300" height="300">Home</a></h1>
