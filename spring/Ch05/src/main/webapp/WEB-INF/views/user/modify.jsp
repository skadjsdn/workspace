<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modyif</title>
</head>
<body>
	<h3>수정</h3>
	<form action="./proc/updateProc.jsp " method="post">
		<table border="1">
			<tr>
				<td>아이디</td>
				<td><input type="text" name="uid" readonly value="asdf"/></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"value="이름"/></td>
			</tr>
			<tr>
				<td>휴대폰</td>
				<td><input type="text" name="hp"value="010-21454"/></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age"value="21"/></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="등록하기"/>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>