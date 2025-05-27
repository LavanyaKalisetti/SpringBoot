<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<h1 style="color:red;text-align:center">STUDENT REGISTRATION FORM</h1>

<frm:form  modelAttribute="stud">

<table border="0" bgcolor="yellow" align="center" >
<tr>
<td>student id::</td>
<td><frm:input path="sno"/></td>
</tr>

<tr>
<td>student name::</td>
<td><frm:input path="sname"/></td>
</tr>

<tr>
<td>student address::</td>
<td><frm:input path="saddrs"/></td>
</tr>

<tr>
<td>student avg::</td>
<td><frm:input path="avg"/></td>
</tr>

<tr>
<td><input type="submit" value="Register"></td>
<td><input type="reset" value="cancel"></td>
</table>
</frm:form>