<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="color:red;text-align:center">Actor Registration Page</h1>

<frm:form modelAttribute="actor">
 <table border="0" align="center" bgcolor="cyan">
  <tr>
    <td>Actor Name:: </td>
    <td><frm:input type="text" path="aname"/> </td>
  </tr>
  
  <tr>
    <td>Actor Address:: </td>
    <td><frm:input type="text" path="addrs"/> </td>
  </tr>
  
  <tr>
    <td>Actor Category:: </td>
    <td><frm:input type="text" path="category"/> </td>
  </tr>
  
  <tr>
    <td>Actor Fee:: </td>
    <td><frm:input type="text" path="fee"/> </td>
  </tr>
  
  <tr>
    <td><input type="Submit" value="Register"> </td>
    <td><input type="Reset" value="Cancel"/> </td>
  </tr>

</table>

</frm:form>
