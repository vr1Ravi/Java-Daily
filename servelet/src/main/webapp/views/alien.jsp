<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Addition JSP</title>
  </head>
  <body>
    <h1>🚀 Alien JSP</h1>

    <!-- Form for user input -->
    <form action="addAlien">
      <label>Name: </label>
      <input type="text" name="aname" required />
      <br /><br />

      <label>Id: </label>
      <input type="number" name="aid" required />
      <br /><br />

      <input type="submit" value="Submit" />
    </form>
  </body>
</html>
