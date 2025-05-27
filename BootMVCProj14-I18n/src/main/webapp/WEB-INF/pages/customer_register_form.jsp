<%@ page isELIgnored="false" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="sp" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
 
 
 <br>
 <br>
 <h2 style="color:green;text-align:center"><sp:message code="registerpage.title"/></h2>
 
 <h3 style="text-align:center"><a href="register"><sp:message code="registerpage.id"></sp:message></a></h3>
 <frm:form modelAttribute="cust">
 <table align="center" bgcolor="cyan">
 
 <tr>
   <td><a href="register"><sp:message code="registerpage.id"/></td>
   <td><frm:input path="cno"/></td>
 </tr>
 
 <tr>
   <td><sp:message code="registerpage.name"/></td>
   <td><frm:input path="cname"/></td>
 </tr>
 
 <tr>
   <td><sp:message code="registerpage.addrs"/></td>
   <td><frm:input path="cadd"/></td>
 </tr>
 
 <tr>
   <td><sp:message code="registerpage.billAmt"/></td>
   <td><frm:input path="billamt"/></td>
 </tr>
 
 <tr>
   <td><input type="submit" value="<sp:message code='registerpage.submit'/>"/></td>
   <td><input type="reset" value="Cancel"></td>
 </tr>
 
 </table>
 </frm:form>
 <center>
 <a href="?lang=fr_FR">French</a> &nbsp;
 <a href="?lang=te_In">Telugu</a> &nbsp;
 <a href="?lang=hi_IN">Hindi</a> &nbsp;
 <a href="?lang=ta_IN">Tamil</a> &nbsp;
 <a href="?lang=de_DE">German</a> &nbsp; 
 <a href="?lang=zh_CH">Chinese</a> &nbsp;
 <a href="?lang=ko_KR">Korean</a> &nbsp;
 <a href="?lang=en_US">English</a> &nbsp;
 </center>
