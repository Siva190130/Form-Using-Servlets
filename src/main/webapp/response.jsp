<%@ page import="com.achala.model.Employee" %>
<%
Employee e = (Employee) request.getAttribute("emp");
%>

<!DOCTYPE html>
<html>
<head>
<title>Submission Successful</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
      rel="stylesheet">

<style>
/* Full screen overlay */
body {
  background: linear-gradient(120deg, #e8f5e9, #ffffff);
  height: 100vh;
  margin: 0;
}

/* Centering container */
.success-wrapper {
  height: 100vh;
  display: flex;
  align-items: center;
  justify-content: center;
}

/* Success card */
.success-card {
  width: 100%;
  max-width: 520px;
  border-radius: 20px;
  padding: 30px;
  box-shadow: 0 20px 40px rgba(0,0,0,0.08);
  animation: slideUp 0.5s ease;
}

/* Title styling */
.success-title {
  color: #198754;
  font-weight: 600;
}

/* Divider line */
.divider {
  height: 1px;
  background-color: #dee2e6;
  margin: 15px 0;
}

/* Animation */
@keyframes slideUp {
  from {
    transform: translateY(40px);
    opacity: 0;
  }
  to {
    transform: translateY(0);
    opacity: 1;
  }
}
</style>
</head>

<body>

<div class="success-wrapper">
  <div class="success-card bg-white text-center">

    <!-- Header -->
    <h4 class="success-title mb-2">
      Submission Successful
    </h4>
    <p class="text-muted mb-3">
      Employee profile has been recorded successfully.
    </p>

    <div class="divider"></div>

    <!-- Transaction-like summary -->
    <div class="text-start">
      <p>
        <strong>Employee Name:</strong><br>
        <%= e.getFullName() %>
      </p>

      <p>
        <strong>Primary Skills:</strong><br>
        <%= e.getPrimarySkills() %>
      </p>

      <p>
        <strong>Skill Rating:</strong><br>
        <%= e.getSkillRating() %> / 5
      </p>
    </div>

    <div class="divider"></div>

    <!-- Action -->
    <div class="d-grid gap-2">
      <a href="index.html" class="btn btn-success">
        Create Another Profile
      </a>
    </div>

  </div>
</div>

</body>
</html>
