<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<h2>Index.jsp</h2>

<div>
    <form action="upload" enctype="multipart/form-data" method="post">
        <input type="file" name="file" />
        <input type="submit" value="upload" />
    </form>
</div>