<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>Registration</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Registration Form</h1>
            <p>Add a Student</p>
        </div>
    </div>
</section>

<section class="container">
    <form:form modelAttribute="student"  action="registration" method="post" class="form-horizontal">
        <form:errors path="*" cssClass="alert alert-danger" element="div"></form:errors>
        <fieldset>
            <legend>Add a new Student</legend>
            <div class="form-group">
                <label class="control-label col-lg-2" for="studentId">Student Id: </label>
                <div class="col-lg-10">
                    <form:input path="id" id="studentId" class="form:input-large" />
                    <form:errors path="id" cssClass="text-danger"></form:errors>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="firstName">First Name: </label>
                <div class="col-lg-10">
                    <form:input path="firstName" id="firstName" class="form:input-large" />
                    <form:errors path="firstName" cssClass="text-danger"></form:errors>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="lastName">Last Name: </label>
                <div class="col-lg-10">
                    <form:input path="lastName" id="lastName"
                                class="form:input-large" />
                    <form:errors path="lastName" cssClass="text-danger"></form:errors>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="email">Email: </label>
                <div class="col-lg-10">
                    <form:input path="email" id="email" class="form:input-large" />
                    <form:errors path="email" cssClass="text-danger"></form:errors>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="gender">Gender: </label>
                <div class="col-lg-10">
                    <form:select path="gender" id="gender"   >
                        <form:option value="Male" label="Male"></form:option>
                        <form:option value="Female" label="Female"></form:option>
                    </form:select>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="birthDay">Birth Day: </label>
                <div class="col-lg-10">
                    <form:input path="birthday" id="birthDay" class="form:input-large" placeholder="MM-DD-YYYY" />
                    <form:errors path="birthday" cssClass="text-danger"></form:errors>
                </div>
            </div>
            <fieldset>
                <legend>Phone Number: </legend>
                <div class="form-group">
                <label class="control-label col-lg-2" for="area">Area Code: </label>
                <div class="col-lg-10">
                    <form:input path="phone.area" id="area" class="form:input-large"/>
                    <form:errors path="phone.area" cssClass="text-danger"></form:errors>
                </div>
                </div>
                <div class="form-group">
                <label class="control-label col-lg-2" for="prefix">Prefix: </label>
                <div class="col-lg-10">
                    <form:input path="phone.prefix" id="prefix" class="form:input-large"/>
                    <form:errors path="phone.prefix" cssClass="text-danger"></form:errors>
                </div>
                </div>
                <div class="form-group">
                <label class="control-label col-lg-2" for="number">Number: </label>
                <div class="col-lg-10">
                    <form:input path="phone.number" id="number" class="form:input-large" />
                    <form:errors path="phone.number" id="number" cssClass="text-danger"></form:errors>
                </div>
                </div>
            </fieldset>

            <div class="form-group">
                <div class="col-lg-10 col-lg-offset-2">
                    <input type="submit" id="btnAdd" class="btn btn-primary" value="Add"/>
                </div>
            </div>

        </fieldset>
    </form:form> </section>

</body>
</html>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
 
</body>
</html>