<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee</title>
<style type="text/css">
   html,
   body {
		    height: 100%;
            width: 100%;
         }
   body {
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
         }
</style>
</head>
<body>
   <form:form modelAttribute="employee" action="register" method="post">
   <h1>Register and Move to playSlip</h1>
   <table>
   <tr>
                        <td><label for="id">Employee Id</label></td>
                        <td>
                            <form:input path="id" required="true" />
                        </td>
                    </tr>
                    <tr>
                        <td><label for="name">Employee Name</label></td>
                        <td>
                            <form:input path="name" required="true" />
                        </td>
                    </tr>
                    <tr>
                        <td><label for="gender">Gender</label></td>
                        <td>
                            <form:input path="gender" required="true" />
                        </td>
                    </tr>
                    <tr>
                        <td><label for="designation">Designation</label></td>
                        <td>
                            <form:input path="designation" required="true" />
                        </td>
                    </tr>
                    <tr>
                        <td><label for="number">Mobile No</label></td>
                        <td>
                            <form:input path="number" required="true" />
                        </td>
                    </tr>
                    <tr>
                        <td><label for="email">Email Id</label></td>
                        <td>
                            <form:input path="email" required="true" />
                        </td>
    </tr>
    <tr>
      <td><label for="gross">Salary (Gross)</label></td>
      <td>
        <form:input path="gross" required="true" />
      </td>
    </tr>
    <tr>
      <td><label for="payDays">PayDays</label></td>
      <td>
        <form:input path="payDays" required="true" />
      </td>
      <td>
      <form:select path="month">
        <option value="1">January</option>
        <option value="2">February</option>
        <option value="3">March</option>
        <option value="4">April</option>
        <option value="5">May</option>
        <option value="6">June</option>
        <option value="7">July</option>
        <option value="8">August</option>
        <option value="9">September</option>
        <option value="10">October</option>
        <option value="11">November</option>
        <option value="12">December</option>
      </form:select>
      </td>
    </tr>
    <tr>
     <td><button type="submit">Register</button></td>
    </tr>
   </table>
   </form:form>
</body>
</html>