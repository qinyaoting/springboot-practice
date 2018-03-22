<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>

</head>
<body>
<h2>Index.jsp</h2>

<div>

</div>
<script>
    deferred();
    function deferred() {
        $.get('defer', function (e) {
            console.info(e.data)
            deferred();
        })
    }
</script>
</body>
</html>
