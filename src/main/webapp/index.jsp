<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,user-scalable=yes">
<title>首页</title>
<link rel="icon" href="https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=566613824,2220522248&fm=58" type="image/x-icon"/>
<link rel="stylesheet" type="text/css" href="css/google.css">
<link rel="stylesheet" type="text/css" href="css/sweetalert.css">
<script src="js/sweetalert.min.js"></script>
<!-- for IE support -->
<script src="js/sweetalert-dev.js"></script> 
</head>

<body>
<h2>Hello World!</h2>
<input type="button" value="点击我" onclick = "test()"/>
</body>

<script type="text/javascript">
	function test() {
		swal('讲义未定稿或已冻结','我就呵呵了...','error');
	}
</script>

</html>
