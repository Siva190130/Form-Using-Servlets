<%@ page import="com.achala.model.Employee" %>
<%
Employee e = (Employee) request.getAttribute("emp");
%>

<!DOCTYPE html>
<html>
<head>
<title>Success</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">
</head>

<body>
<div class="container mt-5">
  <div class="alert alert-success shadow-lg">
    <h4>🎉 Profile Saved Successfully</h4>
    <p><b>Name:</b> <%= e.getFullName() %></p>
    <p><b>Primary Skills:</b> <%= e.getPrimarySkills() %></p>
    <p><b>Skill Rating:</b> ⭐ <%= e.getSkillRating() %>/5</p>
    <p class="text-muted">Welcome to Achala. Your profile shines ✨</p>
  </div>
</div>
</body>
</html>
