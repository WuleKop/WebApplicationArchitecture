<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
<style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id="global">
    <spring:url var = "prod" value="/product" />
<form:form   modelAttribute="product" action="${prod}" method="post">
    <fieldset>
        <legend>Add a product</legend>
        <p>
            <label for="category"><spring:message code="cat"/></label>
            <form:select id="category" path="category.id" >
                <form:option value="-1" label="--Select Category"/>
                <form:options items="${categories}" itemLabel="name" itemValue= "id"/>
            </form:select>
        </p>
         
        <p>
            <label for="name"><spring:message code="pName" /> </label>
            <form:input  id="name" path="name" tabindex="1"/>
        </p>
        <p>
            <label for="description"><spring:message code="desc" /> </label>
            <form:input id="description" value= "${product.description}"
                path="description" tabindex="2" />
        </p>
        <p>
            <label for="price"><spring:message code="pr" /> </label>
            <form:input id="price" path="price" tabindex="3" />
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" 
                value="Add Product">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
