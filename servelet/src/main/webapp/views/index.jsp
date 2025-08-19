<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Addition JSP</title>
  </head>
  <body>
    <h1>🚀 Simple Addition using JSP</h1>

    <!-- Form for user input -->
    <form action="add">
      <label>Enter First Number: </label>
      <input type="number" name="num1" required />
      <br /><br />

      <label>Enter Second Number: </label>
      <input type="number" name="num2" required />
      <br /><br />

      <input type="submit" value="Add Numbers" />
    </form>
  </body>
</html>
