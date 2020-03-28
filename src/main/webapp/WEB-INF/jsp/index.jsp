<!-- I used W3School to help me with the HTML for this assignment.
     https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_navbar_inverse&stacked=h
     https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_table_striped&stacked=h
     Also used this youtube video to help me link the api controller list with the HTML.
     https://www.youtube.com/watch?v=MTw8lW3x7Ck&list=PLdJYl6XU45uLIHaPBQEj-cEMynAl0oeiz&index=10 -->
<!DOCTYPE html>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html lang="en">
<head>
  <title>HW3 Assignment</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">MySQL Database</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
    </ul>
  </div>
</nav>

<div class="container">
  <h2>Sport Items Inventory</h2>
  <p>This information is being gathered from the mySQL server that was set-up using the AWS RDS service.</p>
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Color</th>
        <th>Qty</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach var = "item" items = "${items}">
      <tr>
        <td>${item.name}</td>
        <td>${item.description}</td>
        <td>${item.price}</td>
        <td>${item.color}</td>
        <td>${item.qty}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>


</body>
</html>
