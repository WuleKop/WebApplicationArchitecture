<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Calculate</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="container">
<br>
    <c:if test="${errors != null}">

        <p class="text-danger">
            Error(s)!
        <ul class="text-danger">
            <c:forEach var="error" items="${errors}">
                <li>${error}</li>
            </c:forEach>
        </ul>
    </c:if>

<form action="calc_save" method="post">
    <div class="form-group row">
        <div class="col-xs-2"><input type = "text" name = "add1" size = "2"  value = "${calculator.add1}" class="form-control" /> </div> <div>&nbsp; + &nbsp; </div>
        <div class="col-xs-2"><input type = "text" name = "add2" value = "${calculator.add2}" size = "2" class="form-control"/></div><div>&nbsp; = &nbsp; </div><div class="col-xs-2"><input type = "text" name = "sum" value = "${calculator.sum}"  size = "2" readonly class="form-control"/></div>
    </div>
    <div class="form-group row">
        <div class="col-xs-2"><input type = "text" name = "mult1" value = "${calculator.mult1}" size = "2" class="form-control"/></div><div>&nbsp; * &nbsp; </div>
        <div class="col-xs-2"> <input type = "text" name = "mult2" value = "${calculator.mult2}"  size = "2" class="form-control"/></div><div>&nbsp; = &nbsp; </div><div class="col-xs-2"><input type = "text" name = "product" value = "${calculator.product}"   size = "2" readonly class="form-control"/></div>
    </div>
        <input type = "submit" value = "Submit" class="btn btn-primary"/>


</form>

</div>
</body>
</html>