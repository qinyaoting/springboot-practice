<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>

</head>
<body>
<h2>Index.jsp</h2>

<div>
    <div id="msgFromPush"></div>

</div>
<script>
    if (!!window.EventSource) {

        var source = new EventSource('push');
        s = '';
        source.addEventListener('message', function (e) {
            s += e.data + '<br/>';
            $("#msgFromPush").html(s);
        });

        source.addEventListener('open', function (e) {
            console.info("connection open...")
        }, false);

        source.addEventListener('error', function (e) {
            if (e.readyState ==  EventSource.CLOSED) {
                console.info("conn closed.")
            } else {
                console.info(e.readyState)
            }
            
        }, false)
    } else {
        alert("not support event source")
    }
</script>
</body>
</html>
