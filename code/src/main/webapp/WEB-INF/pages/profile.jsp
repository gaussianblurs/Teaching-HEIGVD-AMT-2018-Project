<%--
    Document   : profile
    Created on : 28.10.2018
    Author     : Samuel Mayor, Alexandra Korukova, Pierre-Samuel Rochat and Arnold von Bauer Gauss
    Goal       : Profile page
--%>

<%@include file="includes/header.jsp" %>

<h1 class="d-inline">Profile</h1>
<hr />

Email : ${user.getEmail()} <br/>
Name  : ${user.getFirstName()} ${user.getLastName()}

<form method="get" action="pages/resetpassword">
    <input type="hidden" name="userId" value="${user.getId()}">
    <button type="submit" class="btn btn-sm btn-danger mt-3" id="resetpwd-btn">Reset password</button>
</form>

<%@include file="includes/footer.jsp" %>

